package MyBlog.DTO;

import lombok.Data;
public enum ResultEnum {
    /*成功*/
    This_Function_Success(4001,"执行成功");
    ;
    private String message;
    private Integer code;
    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    ResultEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
