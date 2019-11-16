package MyBlog.Service.Index;

import MyBlog.Service.Index.Common.MainPageGuide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

@Service
public class IndexService {
    @Autowired
    MainPageGuide mainPageGuide;
    public void buildModel(Model model, HttpServletRequest request){
        mainPageGuide.getMainPageGuide(request,model);//主页文章导航
    }
}
