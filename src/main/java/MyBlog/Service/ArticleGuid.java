package MyBlog.Service;

import MyBlog.Exception.CustomizeErrorCodeEnum;
import MyBlog.Exception.CustomizeException;
import MyBlog.Mapper.ArticleMapper;
import MyBlog.DTO.ArticleDTO;
import MyBlog.DTO.MainPageGuideDto;
import MyBlog.Model.ArticleExample;
import MyBlog.Service.GetArticleList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Component
public class ArticleGuid {
    @Value("${mainPage.ArticlelistSize}")
    Integer listSize;
    @Value("${mainPage.PageGudieSize}")
    Integer guideSize;
    @Autowired
   ArticleMapper articleMapper;
    @Autowired
    private GetArticleList getArticleList;
    public void getMainPageGuide(HttpServletRequest request,  ModelAndView model){
        Integer pageNum=1;
        String num= request.getParameter("pagenum");
        if(num!=null&&!"".equals(num)){//验证传入页码格式
            try {
                pageNum=Integer.parseInt(request.getParameter("pagenum"));
            }catch (Exception e){throw new CustomizeException(CustomizeErrorCodeEnum.PageNum_Error);}
        }
        List<ArticleDTO> list=getArticleList.getArticleList((pageNum-1)*listSize,listSize);
        MainPageGuideDto mainPageGuideDto=new MainPageGuideDto();
        mainPageGuideDto.setList(list);
        ArticleExample articleExample=new ArticleExample();
        Long s=articleMapper.countByExample(articleExample);
        int a= s.intValue();
        mainPageGuideDto.setPageGuide(a,pageNum,guideSize,listSize);
        model.addObject("mainPageGuide",mainPageGuideDto);
    }
}
