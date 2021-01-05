package com.jyinit.babyspace.common.exception;

import com.jyinit.babyspace.common.constant.SysConstant;

/**
 * @author AJ ajin0369@outlook.com
 */
public class BSServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;
    private String code = SysConstant.SYS_CODE.ERROR_CODE;

    public BSServiceException(String message) {
        super(message);
        this.message = message;
    }

    public BSServiceException(String code, String message) {
        super(message);
        this.message = message;
        this.code = code;
    }

    public BSServiceException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public BSServiceException(String code, String message, Throwable cause) {
        super(cause);
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }
}
