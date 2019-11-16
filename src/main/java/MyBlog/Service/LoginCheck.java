package MyBlog.Service;

import MyBlog.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
@Service
public class LoginCheck {
    @Autowired
    GetUserByToken getUserByToken;
    public boolean loginCheck(HttpServletRequest request){
        Cookie[] cookies=request.getCookies();
        if(cookies==null){
           return false;
        }
        User user1=new User();
        User user=getUserByToken.getUserByToken(request);
        user1.setName(user.getName());
        user1.setAvatarUrl(user.getAvatarUrl());
        user1.setId(user.getId());
        if(user!=null){
            request.getSession().setAttribute("user",user1);
            return true;
        }else {
            return false;
        }
    }
}
