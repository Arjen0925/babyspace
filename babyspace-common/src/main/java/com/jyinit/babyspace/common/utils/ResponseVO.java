package com.jyinit.babyspace.common.utils;

import com.jyinit.babyspace.common.constant.SysConstant;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author AJ ajin0369@outlook.com
 */

public class ResponseVO<T> implements Serializable {

    private String msg = StringUtils.EMPTY;

    private Integer code;

    private T data;

    public ResponseVO() {
        this.msg = SysConstant.MSG.SUCCESS;
        this.code = SysConstant.SYS_CODE.SUCCESS_CODE;
    }

    public static <T> ResponseVO<T> successInstance() {
        return new ResponseVO<T>();
    }



    public static <T> ResponseVO<T> successInstance(T data) {
        ResponseVO<T> responseVO = successInstance();
        responseVO.setData(data);
        return responseVO;
    }

    public void setData(T data) {
        this.data = data;
    }
}
