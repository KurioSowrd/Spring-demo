package MyBlog.DTO;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
    @Override
    public String toString() {
        return super.toString();
    }
}
