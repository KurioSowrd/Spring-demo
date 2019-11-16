package MyBlog.DTO;
import MyBlog.Model.Article;
import MyBlog.Model.User;
import lombok.Data;
import org.springframework.stereotype.Component;
@Component
@Data
public class ArticleViewDto {
    private Article article;
    private User user;
}
