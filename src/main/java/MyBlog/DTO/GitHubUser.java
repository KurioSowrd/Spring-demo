package MyBlog.DTO;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class GitHubUser {
    private String name;
    private Long id;
    private String avatar_url;
}
