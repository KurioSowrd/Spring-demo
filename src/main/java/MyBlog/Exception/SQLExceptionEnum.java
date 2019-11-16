package MyBlog.Exception;

public enum  SQLExceptionEnum implements SQLExceptionCode {
    /*文章没有查询到的时候*/
    This_Aticle_Not_exist("这个文章好像从服务器消失了"),
    /*文章查询出错*/
    Select_Article_Error("服务器好像吃坏肚子了"),
    /*这个作者未被查询到*/
    This_Author_Not_exist("这个作者出车祸了!正在抢救中!"),
    /*阅读数设置失败*/
    Article_ViewCount_set_fault("文章阅读数设置失败");
    private String message;
    @Override
    public String getMessage() {
        return message;
    }
     SQLExceptionEnum(String message){
        this.message=message;
    }
}
