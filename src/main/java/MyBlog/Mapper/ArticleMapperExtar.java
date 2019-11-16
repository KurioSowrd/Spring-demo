package MyBlog.Mapper;

import MyBlog.Model.Article;
import MyBlog.Model.ArticleExample;
import org.apache.ibatis.annotations.Param;

public interface ArticleMapperExtar {
    int ivewCountAdd(@Param("record") Article record);
    int updateCommentCount(@Param("record") Article record,@Param("count")Integer count);
}
