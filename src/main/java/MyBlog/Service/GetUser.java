package MyBlog.Service;

import MyBlog.Mapper.UserMapper;
import MyBlog.Model.User;
import MyBlog.Model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class GetUser {
    @Autowired
    UserMapper userMapper;
    public User getUserBytoken(HttpServletRequest request){
        User user=null;
        Cookie[] cookies=request.getCookies();
        if(cookies==null){
            return null;
        }
        for(Cookie cookie:cookies){
            String name=cookie.getName();
            if(cookie.getName().equals("token")){
                String token=cookie.getValue();
                UserExample userExample=new UserExample();
                userExample.createCriteria().andTokenEqualTo(token);
                List<User> users=userMapper.selectByExample(userExample);
                if(users.size()!=0){
                    user=users.get(0);
                }
            }
        }
        return user;
    }
}
