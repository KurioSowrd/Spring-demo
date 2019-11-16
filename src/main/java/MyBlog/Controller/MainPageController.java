package MyBlog.Controller;

import MyBlog.Common.SetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
@Controller
public class MainPageController implements Serializable{
    @Autowired
    SetModel setModel;
    @GetMapping("/")
    public String homePage(HttpServletRequest request,Model model){
     setModel.setMainpageModel(request,model);
        return "Index";
    }
    @GetMapping("myspace")
    public String map(HttpServletRequest request, Model model){
        setModel.setMyspaceModel(request,model);
        return "myspace";
    }
    @GetMapping("ErrorPage")
    public String error(Model model){
        return "ErrorPage";
    }
    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Object model(){
       return setModel.getModel();
    }
}