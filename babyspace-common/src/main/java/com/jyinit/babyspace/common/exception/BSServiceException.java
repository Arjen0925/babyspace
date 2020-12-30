package com.jyinit.babyspace.common.exception;

import com.jyinit.babyspace.common.utils.ResponseVO;

/**
 * @author AJ ajin0369@outlook.com
 */
public class BSServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public BSServiceException(String msg) {
        this.msg = msg;
    }

    public BSServiceException(String message, String msg, int code) {
        super(message);
        this.msg = msg;
        this.code = code;
    }

    public static ResponseVO<String> test(){
        return   ResponseVO.successInstance("is ok");
    }

    public static void main(String[] args) {
        System.out.println(test());;
    }
}
