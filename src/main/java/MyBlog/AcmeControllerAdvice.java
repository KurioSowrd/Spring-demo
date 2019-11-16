package MyBlog;

import MyBlog.Common.SetModel;
import MyBlog.Exception.CustomizeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
@ControllerAdvice
public class AcmeControllerAdvice extends ResponseEntityExceptionHandler {
    @Autowired
    SetModel setModel;
    @ExceptionHandler(Exception.class)
   public ModelAndView modelAndViewhandle(HttpServletRequest request,Throwable ex,Model model){
        HttpStatus httpStatus=getStatus(request);
        if("application/json".equals(request.getContentType())){
            /*Controller返回结果*/
            return null;
        }else{
            if(ex instanceof CustomizeException){
                setErrorPage(model,ex);
            }else {setErrorPageDefault(model,ex);}
            return new ModelAndView("ErrorPage");
        }
    }
    /*
    @ResponseBody
    ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(new CustomErrorType(status.value(), ex.getMessage()), status);
    }
*/
    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
    private void setErrorPage(Model model,Throwable ex){
        setModel.setModel(model);
        model.addAttribute("errormessage", ex.getMessage());
    }
    private void setErrorPageDefault(Model model,Throwable ex){
        setModel.setModel(model);model.addAttribute("errormessage","发生未知错误,服务器在裸奔,已奔出服务区!");
    }
}