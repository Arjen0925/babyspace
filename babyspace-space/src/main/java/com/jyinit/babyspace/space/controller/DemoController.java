package com.jyinit.babyspace.space.controller;

import com.jyinit.babyspace.common.utils.AppResponse;
import com.jyinit.babyspace.common.utils.ResponseVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AJ ajin0369@outlook.com
 */
@RestController
public class DemoController {
    @GetMapping("/test")
    public ResponseVO<String> test(){

        return ResponseVO.successInstance("this is ok");
    }

    @GetMapping("/test2")
    public AppResponse test2(){

        return AppResponse.success("sas","sasa");
    }
}
