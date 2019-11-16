package MyBlog.Service.space;

import MyBlog.Common.PageModel;
import MyBlog.Mapper.ArticleMapper;
import MyBlog.Mapper.UserMapper;
import MyBlog.Model.Article;
import MyBlog.Model.ArticleExample;
import MyBlog.Model.User;
import MyBlog.Service.GetUserByToken;
import MyBlog.Service.space.Common.SpacePublishedModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
@Service
public class SpaceService {
       @Autowired
       GetUserByToken getUserByToken;
       @Autowired
       ArticleMapper articleMapper;
       @Autowired
    SpacePublishedModel spacePublishedModel;
       public List<Article>  getUserArticleList(HttpServletRequest request){
              User user=getUserByToken.getUserByToken(request);
             if(user==null){
                    return null;
             }else {
                 ArticleExample articleExample=new ArticleExample();
                 articleExample.createCriteria().andCreatorEqualTo(user.getId());
                  return articleMapper.selectByExample(articleExample);
             }
       }
       public void buildModel(HttpServletRequest request, PageModel Model){
           Model=spacePublishedModel.publishedListModel(Model,request);
       }
}
