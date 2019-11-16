package MyBlog.Interception;
import MyBlog.Common.SetModel;
import MyBlog.Common.SetModelByInterception;
import MyBlog.Service.Index.Common.MainPageGuide;
import MyBlog.Service.LoginCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Service
public class LoginCheckIntercept implements HandlerInterceptor {
    @Autowired
    LoginCheck loginCheck;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        loginCheck.loginCheck(request);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //setModelByInterception.setModel(request,modelAndView);
        loginCheck.loginCheck(request);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
