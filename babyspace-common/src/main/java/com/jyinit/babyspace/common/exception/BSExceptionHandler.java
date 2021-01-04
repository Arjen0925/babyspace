package com.jyinit.babyspace.common.exception;

import com.jyinit.babyspace.common.pojo.ResponseVO;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author AJ ajin0369@outlook.com
 */
@RestControllerAdvice
public class BSExceptionHandler {

    /**
     * 自定义异常
     * @param e e
     * @return ResponseVO
     */
    @ExceptionHandler(BSServiceException.class)
    public ResponseVO<Object> handleBSServiceException(BSServiceException e) {
        return ResponseVO.error(e.getCode(), e.getMessage());
    }

    /**
     * 未知异常
     * @param e e
     * @return ResponseVO
     */
    @ExceptionHandler(Exception.class)
    public ResponseVO<Object> handleException(Exception e){

        return ResponseVO.error("5000", e.getMessage());
    }

    /**
     *
     * @param e e
     * @return ResponseVO
     */
//    @ExceptionHandler(value = { NoHandlerFoundException.class })
//    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
//    public ResponseVO<Object> methodNotSupportedHandleException(Exception e){
//
//        return ResponseVO.error("5000", e.getMessage());
//    }

    @ExceptionHandler(value = { ArithmeticException.class })
        public ResponseVO<Object> methodNotSupportedHandleException(Exception e){

        return ResponseVO.error("5000", e.getMessage());
    }
}
