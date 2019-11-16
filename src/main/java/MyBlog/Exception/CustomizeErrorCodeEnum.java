package MyBlog.Exception;

public enum CustomizeErrorCodeEnum implements CustomizeErrorCode {
    /*PageNumOverstep_Error*/
    PageNumOverstep_Error(1001,"没有那么多页啦!"),
    /*PageNum_Error=传入页码格式错误*/
    PageNum_Error(1002,"输入的页码格式不对"),
    /*Article_Not_Found=文章未找到时候发出信息*/
    Atticle_Not_Found(1003,"你所找的文章并不在服务期内"),
    /*需求用户登录状态*/
    User_Not_Login_On(2001,"未登录状态,不能进行这个操作"),
    /*目标文章没有获取到*/
    Target_Article_Not_Found(3001,"目标文章没获取到"),
    /*没有填写内容*/
    Not_Input_Discription(2002,"没有填写内容啊!");
    private String message;
    private int code;
@Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getCode() {
        return code;
    }

    CustomizeErrorCodeEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
