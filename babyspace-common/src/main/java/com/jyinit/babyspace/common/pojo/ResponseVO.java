package com.jyinit.babyspace.common.pojo;

import com.jyinit.babyspace.common.constant.SysConstant;
import java.io.Serializable;

/**
 * @author AJ ajin0369@outlook.com
 */

public class ResponseVO<T> implements Serializable {

    private static final long serialVersionUID = 4803925716205728179L;

    private String code;

    private String message;

    private T data;


    public ResponseVO() {
    }


    public ResponseVO(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseVO(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseVO<T> ok(T data) {
        return new ResponseVO<T>(SysConstant.SYS_CODE.SUCCESS_CODE, SysConstant.SYS_MSG.SUCCESS, data);
    }

    public static <T> ResponseVO<T> ok() {
        return new ResponseVO<T>(SysConstant.SYS_CODE.SUCCESS_CODE, SysConstant.SYS_MSG.SUCCESS);
    }

    public static <T> ResponseVO<T> error() {
        return new ResponseVO<T>(SysConstant.SYS_CODE.ERROR_CODE, SysConstant.SYS_MSG.ERROR);
    }

    public static <T> ResponseVO<T> error(String code,String message) {
        return new ResponseVO<T>(code, message);
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
