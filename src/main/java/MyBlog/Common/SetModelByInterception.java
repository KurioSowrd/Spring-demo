package MyBlog.Common;
import MyBlog.Service.ArticleGuid;
import MyBlog.Service.LoginCheck;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Enumeration;
@Component
public class SetModelByInterception {
    @Autowired
    ArticleGuid mainPageGuide;
    PageModel Model;
    @Autowired
    LoginCheck loginCheck;
    public void setModel(HttpServletRequest request, ModelAndView model){
        String jsonStr = getPagejson();
        mainPageGuide.getMainPageGuide(request,model);
        Model= JSON.parseObject(jsonStr,PageModel.class);
        setMyspaceModel(request,Model);
        model.addObject("Model",Model);
    }

    public void setMyspaceModel(HttpServletRequest request,PageModel pageModel){
        Enumeration enumeration =request.getParameterNames();
        while (enumeration.hasMoreElements()){
            String str=enumeration.nextElement().toString();
            System.out.println(str);
            if("map".equals(str)){
                pageModel.getMyspace().setSelected(request.getParameter(str));
            }
        }
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
}
