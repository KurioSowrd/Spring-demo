package MyBlog.DTO;

import lombok.Data;

@Data
public class CommentDTO {
   private Integer articleId;
   private String discription;
}
