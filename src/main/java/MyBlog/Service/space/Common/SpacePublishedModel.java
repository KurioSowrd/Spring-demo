package MyBlog.Service.space.Common;

import MyBlog.Common.PageModel;
import MyBlog.Model.Article;
import MyBlog.Service.space.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Component
public class SpacePublishedModel {
    @Autowired
    SpaceService spaceService;
    public PageModel publishedListModel(PageModel Model, HttpServletRequest request){
        Enumeration enumeration =request.getParameterNames();
        while (enumeration.hasMoreElements()){
            String str=enumeration.nextElement().toString();
            if("map".equals(str)){ Model.getMyspace().setSelected(request.getParameter(str));
            }
            if("published".equals(request.getParameter(str))){
                List<Article> articleList=spaceService.getUserArticleList(request);
                List<Article> pageArticleList=new ArrayList<>();
                Integer pagenum;
                if(request.getParameter("pagenum")!=null){
                    pagenum=Integer.parseInt(request.getParameter("pagenum"));
                }else{pagenum=1;}
                for(Integer a=((pagenum-1)*5);a<articleList.size()&&a<pagenum*5;a++){
                    pageArticleList.add(articleList.get(a));
                }
                List<Integer> publishedPageCount=new ArrayList<>();
                for(int a=1;a<=(articleList.size()/5+1);a++){
                    publishedPageCount.add(a);
                }
                if(pagenum==publishedPageCount.size()){
                    Model.getMyspace().setLastPage(true);
                }else{
                    Model.getMyspace().setLastPage(false);
                }
                if(pagenum==1){
                    Model.getMyspace().setFirstPage(true);
                }else {
                    Model.getMyspace().setFirstPage(false);
                }
                Model.getMyspace().setPublishedPageCount(publishedPageCount);
                Model.getMyspace().setPagenum(pagenum);
                Model.getMyspace().setTootalPage((articleList.size()/5)+1);
                Model.getMyspace().setArticleList(pageArticleList);
            }
        }
        return Model;
    }
}
