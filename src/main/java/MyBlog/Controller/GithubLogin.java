package MyBlog.Controller;

import MyBlog.Model.UserExample;
import MyBlog.Service.GitOauth.GithubProvider;
import MyBlog.Mapper.UserMapper;
import MyBlog.DTO.AccessTokenDTO;
import MyBlog.DTO.GitHubUser;
import MyBlog.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

@Controller
public class GithubLogin {
    @Autowired
    private GithubProvider githubProvider;
    @Autowired
    private AccessTokenDTO accessTokenDTO;GitHubUser gitHubuser;
    @Value("${github.client.id}")
    private String clientid;
    @Value("${github.redirct.url}")
    private String redirecturl;
    @Value("${github.client.secret}")
    private String clientsecret;
    @Autowired
    private UserMapper userMapper;
    @GetMapping("callback")
    public String callback(@RequestParam(name="code")String code, @RequestParam(name="state")String state, HttpServletRequest request, HttpServletResponse response){
        accessTokenDTO=new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        accessTokenDTO.setClient_id(clientid);
        accessTokenDTO.setRedirect_uri(redirecturl);
        accessTokenDTO.setClient_secret(clientsecret);
        String accessToken =githubProvider.getAccessToken(accessTokenDTO).split("=")[1].split("&")[0];
        gitHubuser=githubProvider.gitHubUser(accessToken);
        if(gitHubuser!=null){
            User user;
            String token= UUID.randomUUID().toString();
            UserExample userExample=new UserExample();
            userExample.createCriteria().andAccountidEqualTo(gitHubuser.getId().toString());
            List<User> users=userMapper.selectByExample(userExample);
            if(users.size()!=0){
                 user=users.get(0);
                 user.setToken(token);
                userMapper.updateByPrimaryKey(user);
            }else{
                user=new User();
                user.setToken(token);
                user.setName(gitHubuser.getName());
                user.setAccountid(gitHubuser.getId().toString());
                user.setGmtCreate(System.currentTimeMillis());
                user.setGmtModified(user.getGmtCreate());
                user.setAvatarUrl(gitHubuser.getAvatar_url());
                userMapper.insert(user);
            }
            response.addCookie(new Cookie("token",token));
            // request.getSession().setAttribute("user",gitHubuser);
            return "redirect:/";
        }else{
            return "redirect:/";
        }
    }
}
