package MyBlog.Model;

public class ArticleWithBLOBs extends Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ARTICLE.DISCRIPTION
     *
     * @mbg.generated Sun Sep 22 22:59:54 CST 2019
     */
    private String discription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ARTICLE.TAG
     *
     * @mbg.generated Sun Sep 22 22:59:54 CST 2019
     */
    private String tag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ARTICLE.DISCRIPTION
     *
     * @return the value of ARTICLE.DISCRIPTION
     *
     * @mbg.generated Sun Sep 22 22:59:54 CST 2019
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ARTICLE.DISCRIPTION
     *
     * @param discription the value for ARTICLE.DISCRIPTION
     *
     * @mbg.generated Sun Sep 22 22:59:54 CST 2019
     */
    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ARTICLE.TAG
     *
     * @return the value of ARTICLE.TAG
     *
     * @mbg.generated Sun Sep 22 22:59:54 CST 2019
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ARTICLE.TAG
     *
     * @param tag the value for ARTICLE.TAG
     *
     * @mbg.generated Sun Sep 22 22:59:54 CST 2019
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }
}