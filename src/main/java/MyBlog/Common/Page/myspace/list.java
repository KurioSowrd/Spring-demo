package MyBlog.Common.Page.myspace;

import MyBlog.Common.Page.Link;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class list {
    private Link Myinfomation;
    private Link Comment;
    private Link message;
    private Link published;
    private Link liked;
    public List<Link> list(){
        List<Link> links=new ArrayList<>();
        links.add(Myinfomation);
        links.add(message);
        links.add(Comment);
        links.add(published);
        links.add(liked);
        return links;
    }
}
