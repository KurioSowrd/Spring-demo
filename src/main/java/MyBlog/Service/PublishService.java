package MyBlog.Service;

import MyBlog.Mapper.ArticleMapper;
import MyBlog.Model.Article;
import MyBlog.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
@Service
public class PublishService {
    @Autowired
    GetUserByToken getUserByToken;
    @Autowired
    ArticleMapper articleMapper;
    public boolean PublishArticle(HttpServletRequest request,Model model,String tittle, String discription, String tag){
        User user=getUserByToken.getUserByToken(request);
        model.addAttribute("tittle",tittle);
        model.addAttribute("discription",discription);
        model.addAttribute("tag",tag);
        if(user==null){
            System.out.println("error");
            model.addAttribute("error","用户未登录");
            return false;
        }
        System.out.println("success");
        Article article=new Article();
        if(tittle.equals("")){
            model.addAttribute("error","没有写标题!");
            return false;
        }
        if(discription.equals("")){
            model.addAttribute("error","没有内容啊!");
            return false;
        }
        try{
            article.setTittle(tittle);
            article.setDiscription(discription);
            article.setGmtCreate(System.currentTimeMillis());
            article.setGmtModified(article.getGmtCreate());
            article.setCreator(user.getId());
            article.setLikeCount(0);
            article.setViewCount(0);
            article.setCommentCount(0);
            articleMapper.insert(article);
        }catch (Exception e){model.addAttribute("error","未知原因,发布失败"); return false;}
        return true;
    }
}
