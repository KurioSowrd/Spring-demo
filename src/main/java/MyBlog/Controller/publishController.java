package MyBlog.Controller;

import MyBlog.Common.SetModel;
import MyBlog.Exception.PublishException;
import MyBlog.Mapper.ArticleMapper;
import MyBlog.Service.GetUserByToken;
import MyBlog.Model.Article;
import MyBlog.Model.User;
import MyBlog.Service.LoginCheck;
import MyBlog.Service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class publishController {
    @Autowired
    SetModel setModel;
    @GetMapping("/publish")
    public String publish(Model model){
        setModel.setModel(model);
        return "publish";
    }
   @Autowired
    PublishService publishService;
    @PostMapping("/publish")
   public String duPublish(HttpServletRequest request,@RequestParam("tittle")String tittle, @RequestParam("discription")String discription, @RequestParam("tag")String tag, Model model){
        setModel.setModel(model);
        if(publishService.PublishArticle(request,model,tittle,discription,tag)){
            return "redirect:/";
        }else{
            return "publish";
        }
   }
}
