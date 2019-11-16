package MyBlog.Common.Page;

import lombok.Data;

@Data
public class Link {
    private String name;
    private String link;
    private Boolean selected=false;
    public Link(){
       selected=false;
    }
}
