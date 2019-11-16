package MyBlog.Service;

import MyBlog.DTO.CommentDTO;
import MyBlog.DTO.ResultDTO;
import MyBlog.DTO.ResultEnum;
import MyBlog.Exception.CustomizeErrorCodeEnum;
import MyBlog.Exception.CustomizeException;
import MyBlog.Mapper.ArticleMapper;
import MyBlog.Mapper.ArticleMapperExtar;
import MyBlog.Mapper.CommentMapper;
import MyBlog.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

@Service
public class CommentService {
    @Autowired
    ArticleMapperExtar articleMapperExtar;
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    CommentMapper commentMapper;
    @Autowired
    GetUserByToken getUserByToken;
    @Transactional
    public Object commentSave(@RequestBody CommentDTO commentDTO, HttpServletRequest request){
        User user=getUserByToken.getUserByToken(request);
        if(user==null){
            return ResultDTO.error(CustomizeErrorCodeEnum.User_Not_Login_On);
        }
        if(commentDTO.getDiscription()==null||"".equals(commentDTO.getDiscription())){
            return ResultDTO.error(CustomizeErrorCodeEnum.Not_Input_Discription);
        }
        Article article=articleMapper.selectByPrimaryKey(commentDTO.getArticleId());
        if(article==null){
            return ResultDTO.error(CustomizeErrorCodeEnum.Target_Article_Not_Found);
        }
        Comment comment=new Comment();
        comment.setArticleid(commentDTO.getArticleId());
        comment.setLikeCount(0);
        comment.setDiscription(commentDTO.getDiscription());
        comment.setCommentator(user.getId());
        comment.setType(1);
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setGmtModified(comment.getGmtCreate());
        commentMapper.insert(comment);
        CommentExample commentExample=new CommentExample();
        commentExample.createCriteria().andArticleidEqualTo(comment.getArticleid());
        Long commentCount=commentMapper.countByExample(commentExample);
        Integer count=commentCount.intValue();
        articleMapperExtar.updateCommentCount(article,count);
        return ResultDTO.Success(ResultEnum.This_Function_Success);
    }
}
