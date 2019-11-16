package MyBlog.Interception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
//@EnableWebMvc
@Service
public class Interceptor implements WebMvcConfigurer {
    @Autowired LoginCheckIntercept Intercept;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(Intercept).addPathPatterns("/**");
    }
}
