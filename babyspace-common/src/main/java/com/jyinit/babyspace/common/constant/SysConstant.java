package com.jyinit.babyspace.common.constant;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;

/**
 * @author AJ ajin0369@outlook.com
 */
public interface SysConstant {

    class MSG {
        /**
         * 操作成功
         */
        public static final String SUCCESS = "SUCCESS";

        public static String ERROR = "系统错误，请联系管理员";
    }

    class SYS_CODE {
            public static final Integer SUCCESS_CODE = HttpStatus.SC_OK;


    }
}
