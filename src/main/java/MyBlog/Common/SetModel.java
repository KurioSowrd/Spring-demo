package MyBlog.Common;
import MyBlog.Common.Page.Link;
import MyBlog.DTO.ArticlePageDTO;
import MyBlog.Model.Article;
import MyBlog.Service.ArticlePageService;
import MyBlog.Service.Index.IndexService;
import MyBlog.Service.LoginCheck;
import MyBlog.Service.space.SpaceService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Component
public class SetModel {
    @Autowired
    IndexService indexService;
    PageModel Model;
    @Autowired
    LoginCheck loginCheck;
    public SetModel(){
        String jsonStr = getPagejson();
        Model=JSON.parseObject(jsonStr,PageModel.class);//model.addAttribute("Model",Model);
    }
    public PageModel setModel(Model model){
        model.addAttribute("Model",Model);
        return Model;
    }
    public void setMainpageModel(HttpServletRequest request,Model model){
        indexService.buildModel(model,request);
        model.addAttribute("Model",Model);
    }
    @Autowired
    SpaceService spaceService;
    public void setMyspaceModel(HttpServletRequest request,Model model){
        spaceService.buildModel(request,Model);
        model.addAttribute("Model",Model);
    }
    @Autowired
   ArticlePageService articlePageService;
    public  void setArticlePageModle(HttpServletRequest request,Model model){
     model.addAttribute("MainArticle", articlePageService.getMianArticle(request));
     model.addAttribute("Model",Model);
    }
    private String getPagejson(){
        try{
            String jsonStr = "";
            File jsonFile = new File(System.getProperty("user.dir")+"/Page.json");
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
           return jsonStr;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    private PageModel pageModel(){
        String jsonStr = getPagejson();
        return JSON.parseObject(jsonStr,PageModel.class);//model.addAttribute("Model",Model);
    }
    public PageModel getModel(){
        return Model;
    }
}
