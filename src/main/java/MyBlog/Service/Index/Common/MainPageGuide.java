package MyBlog.Service.Index.Common;

import MyBlog.DTO.ArticleDTO;
import MyBlog.DTO.MainPageGuideDto;
import MyBlog.Exception.CustomizeErrorCodeEnum;
import MyBlog.Exception.CustomizeException;
import MyBlog.Mapper.ArticleMapper;
import MyBlog.Model.ArticleExample;
import MyBlog.Service.GetArticleList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component
public class MainPageGuide {
    @Value("${mainPage.ArticlelistSize}")
    Integer listSize;
    @Value("${mainPage.PageGudieSize}")
    Integer guideSize;
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    private GetArticleList getArticleList;
    public MainPageGuideDto getMainPageGuide(HttpServletRequest request,Model model){
        Integer pageNum=1;
        ArticleExample articleExample=new ArticleExample();
        Long s=articleMapper.countByExample(articleExample);
        int a= s.intValue();
        if(request.getParameter("pagenum")!=null){
            try { pageNum=Integer.parseInt(request.getParameter("pagenum")); }catch (Exception e){throw new CustomizeException(CustomizeErrorCodeEnum.PageNum_Error);}
            if(pageNum>a){
                throw new CustomizeException(CustomizeErrorCodeEnum.PageNumOverstep_Error);
            }
        }
         List<ArticleDTO> list=getArticleList.getArticleList((pageNum-1)*listSize,listSize);
         MainPageGuideDto mainPageGuideDto=new MainPageGuideDto();
         mainPageGuideDto.setList(list);
         mainPageGuideDto.setPageGuide(a,pageNum,guideSize,listSize);
         model.addAttribute("mainPageGuide",mainPageGuideDto);
         return mainPageGuideDto;
    }
}
