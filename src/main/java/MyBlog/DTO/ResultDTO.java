package MyBlog.DTO;

import MyBlog.Exception.CustomizeErrorCodeEnum;
import MyBlog.Exception.CustomizeException;
import lombok.Data;

@Data
public class ResultDTO {
    private Boolean result;
    private Integer code;
    private String message;
    public static ResultDTO result(Integer code,String message,Boolean result){
        ResultDTO resultDTO=new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        resultDTO.setResult(result);
        return resultDTO;
    }
    public static ResultDTO error(CustomizeErrorCodeEnum errorCodeEnum){
        return result(errorCodeEnum.getCode(),errorCodeEnum.getMessage(),false);
    }
    public static ResultDTO Success(ResultEnum resultEnum){
        return result(resultEnum.getCode(),resultEnum.getMessage(),true);
    }
}
