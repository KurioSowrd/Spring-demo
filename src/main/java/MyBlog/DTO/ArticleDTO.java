package MyBlog.DTO;

import MyBlog.Model.Article;
import MyBlog.Model.User;
import lombok.Data;
@Data
public class ArticleDTO {
    private Article article;
    private String userIMG;
    private String userName;
    private Integer num;
}
