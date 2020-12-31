package com.jyinit.babyspace.common.exception;

import com.jyinit.babyspace.common.pojo.ResponseVO;

/**
 * @author AJ ajin0369@outlook.com
 */
public class BSServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;
    private int code = 500;

    public BSServiceException(String msg) {
        this.message = msg;
    }

    public BSServiceException(String message, String msg, int code) {
        super(message);
        this.message = msg;
        this.code = code;
    }


}
