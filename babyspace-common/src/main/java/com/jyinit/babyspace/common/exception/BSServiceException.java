package com.jyinit.babyspace.common.exception;

import com.jyinit.babyspace.common.pojo.ResponseVO;

/**
 * @author AJ ajin0369@outlook.com
 */
public class BSServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;
    private String code = "5000";

    public BSServiceException(String message) {
        super(message);
        this.message = message;
    }

    public BSServiceException(String message, String code) {
        super(message);
        this.message = message;
        this.code = code;
    }
    public BSServiceException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public BSServiceException(Throwable cause, String message, String code) {
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
