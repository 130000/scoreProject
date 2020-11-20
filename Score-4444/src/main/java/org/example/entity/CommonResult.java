package org.example.entity;

/**
 * @author wsd_02
 */
public class CommonResult<T>{
    private Integer code;
    private String message;
    private T information;


    public CommonResult(Integer code, String message) {
       this(code,message,null);
    }

    public CommonResult(Integer code, String message, T information) {
        this.code = code;
        this.message = message;
        this.information = information;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getinformation() {
        return information;
    }

    public void setinformation(T information) {
        this.information = information;
    }
}
