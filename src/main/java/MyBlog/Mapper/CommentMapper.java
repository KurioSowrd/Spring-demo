package MyBlog.Mapper;

import MyBlog.Model.Comment;
import MyBlog.Model.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    List<Comment> selectByExampleWithRowbounds(CommentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    Comment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 01 04:16:51 CST 2019
     */
    int updateByPrimaryKey(Comment record);
}