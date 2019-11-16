package MyBlog.Common.Page.myspace;
import MyBlog.Common.Page.Link;
import MyBlog.Mapper.ArticleMapper;
import MyBlog.Model.Article;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
public class myspace {
    private String tittle;
    private String link;
    private list list;
    private List<Article> articleList;
    private List<Integer> publishedPageCount;
    public boolean firstPage;
    public boolean lastPage;
    private Integer pagenum;
    private Integer tootalPage;
  public void setSelected(String map){
      for(Link link:list.list()){
          if(link.getLink().equals(map)){
              link.setSelected(true);
          }else{
              link.setSelected(false);
          }
      }
  }
}
