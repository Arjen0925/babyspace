package com.jyinit.babyspace.auth.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author AJ ajin0369@outlook.com
 */
@Configuration
public class MyMetaObjHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.hasSetter("createTime")) {
            setFieldValByName("createTime", LocalDateTime.now(), metaObject);
        }
        if(metaObject.hasSetter("isDelete")){
            setFieldValByName("isDelete", false, metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if(metaObject.hasSetter("updateTime")){
            Object updateTime = getFieldValByName("updateTime", metaObject);
            if(Objects.nonNull(updateTime)){
                setFieldValByName("updateTime", updateTime, metaObject);
            }else {
                setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
            }
        }

    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
