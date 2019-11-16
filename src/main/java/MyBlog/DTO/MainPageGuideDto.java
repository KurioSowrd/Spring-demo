package MyBlog.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class MainPageGuideDto {
    private List<ArticleDTO> list;
    private List<Integer> pageGuide;
    private boolean nextPage;
    private boolean previousPage;
    private boolean firstPage;
    private boolean lastPage;
    private Integer pageCount;
    private Integer pageNum;
    private Integer totalPage;
    public void  setPageGuide(Integer totalCount, Integer pageNum, Integer guidesize,Integer listsize){
               this.pageNum=pageNum;
               if(totalCount%listsize==0){
                   totalPage=totalCount/listsize;
               }else{
                   totalPage=totalCount/listsize+1;
               }
                previousPage=!pageNum.equals(1);
                nextPage=pageNum.equals(totalPage);
                firstPage=!pageNum.equals(1);
                lastPage=!pageNum.equals(totalPage);
                pageGuide=new ArrayList<>();
                for(int i=0;i<guidesize;i++){
                    if(pageNum+guidesize>totalPage){
                        Integer page=pageNum-(pageNum+guidesize-totalPage)+i+1;
                        if(page>0){
                            pageGuide.add(page);
                        }
                    }else {
                        if(pageNum-(guidesize/2)-1<0){
                            pageGuide.add(i+1);
                        }else{
                            pageGuide.add(pageNum+i-guidesize/2);
                        }
                    }
                }
    }
}
