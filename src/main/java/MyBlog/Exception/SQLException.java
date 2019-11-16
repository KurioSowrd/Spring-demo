package MyBlog.Exception;

public class SQLException extends RuntimeException {
    private String message;
    public SQLException(String message){
        this.message=message;
    }
    public SQLException(SQLExceptionEnum errorCodeEnum){
        this.message=errorCodeEnum.getMessage();
    }
    @Override
    public String getMessage() {
        return message;
    }
}
