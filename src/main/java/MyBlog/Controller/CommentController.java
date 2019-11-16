package MyBlog.Controller;

import MyBlog.DTO.CommentDTO;
import MyBlog.DTO.ResultDTO;
import MyBlog.Exception.CustomizeErrorCode;
import MyBlog.Exception.CustomizeErrorCodeEnum;
import MyBlog.Exception.CustomizeException;
import MyBlog.Model.Comment;
import MyBlog.Model.User;
import MyBlog.Service.CommentService;
import MyBlog.Service.GetUserByToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CommentController {
   @Autowired
    CommentService commentService;
    @ResponseBody
    @RequestMapping(value = "comment",method = RequestMethod.POST)
    public Object commentSave(@RequestBody CommentDTO commentDTO, HttpServletRequest request){
      return commentService.commentSave(commentDTO,request);
    }
}
