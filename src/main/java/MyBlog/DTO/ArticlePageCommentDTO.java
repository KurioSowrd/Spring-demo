package MyBlog.DTO;

import MyBlog.Model.Comment;
import MyBlog.Model.CommentExample;
import MyBlog.Model.User;
import lombok.Data;

import java.util.List;
@Data
public class ArticlePageCommentDTO {
    private User user;
    private Comment comment;
    private Integer num;
}
