package MyBlog.DTO;

import MyBlog.Model.Article;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class ArticlePageDTO {
    private ArticleViewDto articleViewDto;
    List<ArticlePageCommentDTO> commentList;
}
