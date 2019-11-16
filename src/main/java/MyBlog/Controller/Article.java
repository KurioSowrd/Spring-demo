package MyBlog.Controller;

import MyBlog.Common.SetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Article {
    @Autowired
    SetModel setModel;
    @GetMapping("Article")
    public String articlePage(HttpServletRequest request,Model model){
        setModel.setArticlePageModle(request,model);
        return "Article";
    }
}
