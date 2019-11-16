package MyBlog.Service;

import MyBlog.Exception.CustomizeErrorCodeEnum;
import MyBlog.Exception.CustomizeException;
import MyBlog.Mapper.ArticleMapper;
import MyBlog.Mapper.UserMapper;
import MyBlog.Model.*;
import MyBlog.DTO.ArticleDTO;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class GetArticleList {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    UserMapper userMapper;
    public List<ArticleDTO> getArticleList(Integer offset,Integer size){
        ArticleExample articleExample=new ArticleExample();
        articleExample.setOrderByClause("GMT_MODIFIED DESC");//对比节点降序排列
        List<Article> list=articleMapper.selectByExampleWithBLOBsWithRowbounds(articleExample,new RowBounds(offset,size));//范围查询
        if(list.size()==0){
            throw new CustomizeException(CustomizeErrorCodeEnum.Atticle_Not_Found);
        }
        List<ArticleDTO> arrticleDtolist=new ArrayList<>();
        for(Article article:list){
            User user=userMapper.selectByPrimaryKey(article.getCreator());
            //给DTO注入User属性
            ArticleDTO articleDTO=new ArticleDTO();
            articleDTO.setUserIMG(user.getAvatarUrl());
            articleDTO.setUserName(user.getName());
            articleDTO.setArticle(article);
            articleDTO.setNum(list.indexOf(article));
            arrticleDtolist.add(articleDTO);
        }
        return arrticleDtolist;
    }
}
