package MyBlog.Controller;

import MyBlog.Common.SetModel;
import MyBlog.Exception.CustomizeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.http.HttpStatus;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;

@Controller
@RequestMapping("ErrorPage")
public class CustomizeErrorController implements ErrorController  {
    @Override
    public String getErrorPath() {
        return "ErrorPage";
    }
    @Autowired
    SetModel setModel;
    @RequestMapping(produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView modelAndViewhandle(HttpServletRequest request, Throwable ex, Model model){
        HttpStatus httpStatus= getStatus(request);
        setModel.setModel(model);
        if(httpStatus.is4xxClientError()){
            model.addAttribute("errormessage","页面不见了");
        }
        if(httpStatus.is5xxServerError()){
             model.addAttribute("errormessage","服务器在裸奔,已经奔出服务区");
        }
        return new ModelAndView("ErrorPage");
    }
    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
