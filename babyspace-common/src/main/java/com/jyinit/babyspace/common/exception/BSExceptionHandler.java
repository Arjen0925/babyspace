package com.jyinit.babyspace.common.exception;

import com.jyinit.babyspace.common.constant.SysConstant;
import com.jyinit.babyspace.common.pojo.ResponseVO;
import org.springframework.web.bind.annotation.ExceptionHandler;

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
     *
     * @param e e
     * @return ResponseVO
     */
    @ExceptionHandler(Exception.class)
    public ResponseVO<Object> handleException(Exception e){

        return ResponseVO.error(SysConstant.SYS_CODE.ERROR_CODE, e.getMessage());
    }

}
