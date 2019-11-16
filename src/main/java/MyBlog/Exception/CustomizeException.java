package MyBlog.Exception;

public class CustomizeException extends RuntimeException {
    private Integer code;
    private String message;
    public CustomizeException(String message){
        this.message=message;
    }
    public CustomizeException(CustomizeErrorCodeEnum errorCodeEnum){
        this.message=errorCodeEnum.getMessage();this.code=errorCodeEnum.getCode();
    }
    @Override
    public String getMessage() {
        return message;
    }
    public Integer getCode(){
        return code;
    }
}
