package MyBlog.Service;
import MyBlog.DTO.ArticleDTO;
import MyBlog.DTO.ArticlePageCommentDTO;
import MyBlog.DTO.ArticlePageDTO;
import MyBlog.DTO.ArticleViewDto;
import MyBlog.Exception.SQLException;
import MyBlog.Exception.CustomizeErrorCodeEnum;
import MyBlog.Exception.SQLException;
import MyBlog.Exception.SQLExceptionEnum;
import MyBlog.Mapper.ArticleMapper;
import MyBlog.Mapper.ArticleMapperExtar;
import MyBlog.Exception.CustomizeException;
import MyBlog.Mapper.CommentMapper;
import MyBlog.Mapper.UserMapper;
import MyBlog.Model.*;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.jdbc.Sql;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArticlePageService {
    @Autowired
    CommentMapper commentMapper;
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    ArticleMapperExtar articleMapperExtar;
    public ArticlePageDTO getMianArticle(HttpServletRequest request){
        Integer articleId;
        ArticlePageDTO articlePageDTO=new ArticlePageDTO();
        String articleParama=request.getParameter("ArticleID");
        if(articleParama!=null&&!"".equals(articleParama)){
            try {
                articleId= Integer.parseInt(articleParama);
            }catch (Exception e){ throw new CustomizeException(CustomizeErrorCodeEnum.PageNum_Error); }
            ArticleViewDto articleViewDto=new ArticleViewDto();
            Article mainArticle;
            User user;
            mainArticle= articleMapper.selectByPrimaryKey(articleId);
            if(mainArticle==null){
                throw new CustomizeException(CustomizeErrorCodeEnum.Atticle_Not_Found);
            }
            if(articleMapperExtar.ivewCountAdd(mainArticle)==1){
                mainArticle=articleMapper.selectByPrimaryKey(articleId);
            }else{
                throw new SQLException(SQLExceptionEnum.Article_ViewCount_set_fault);
            }
            try{
                user=userMapper.selectByPrimaryKey(mainArticle.getCreator());
                if(user==null){
                    throw new SQLException(SQLExceptionEnum.This_Author_Not_exist);
                }
                articleViewDto.setArticle(mainArticle);
                articleViewDto.setUser(user);
                articlePageDTO.setArticleViewDto(articleViewDto);
                articlePageDTO.setCommentList(getComment(articleId,0,10));
            }catch (Exception e){throw new SQLException(SQLExceptionEnum.Select_Article_Error);}
        }else { throw new CustomizeException(CustomizeErrorCodeEnum.Atticle_Not_Found);}
        return articlePageDTO;
    }
    private List<ArticlePageCommentDTO> getComment(Integer articleid,Integer offset,Integer size){
        CommentExample commentExample=new CommentExample();
        commentExample.createCriteria().andArticleidEqualTo(articleid);
        commentExample.setOrderByClause("GMT_MODIFIED DESC");
        List<Comment> commentList;
        commentList=commentMapper.selectByExampleWithRowbounds(commentExample,new RowBounds(offset,size));
        List<ArticlePageCommentDTO> articlePageCommentDTOList=new ArrayList<>();
        for(Comment comment:commentList){
            User user=userMapper.selectByPrimaryKey(comment.getCommentator());
            User user1=new User();
            user1.setName(user.getName());
            user1.setId(user.getId());
            user1.setGmtCreate(user.getGmtCreate());
            user1.setAvatarUrl(user.getAvatarUrl());
            ArticlePageCommentDTO articlePageCommentDTO=new ArticlePageCommentDTO();
            articlePageCommentDTO.setComment(comment);
           articlePageCommentDTO.setUser(user1);
           articlePageCommentDTO.setNum(commentList.indexOf(comment));
            articlePageCommentDTOList.add(articlePageCommentDTO);
        }
        return articlePageCommentDTOList;
    }
}
