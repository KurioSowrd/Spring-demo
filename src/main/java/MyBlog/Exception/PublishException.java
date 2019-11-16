package MyBlog.Exception;

public class PublishException extends RuntimeException {
    private String message;
    public PublishException(String message){
        this.message=message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
