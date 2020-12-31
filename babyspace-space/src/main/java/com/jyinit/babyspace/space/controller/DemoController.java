package com.jyinit.babyspace.space.controller;

import com.jyinit.babyspace.common.utils.AppResponse;
import com.jyinit.babyspace.common.utils.R;
import com.jyinit.babyspace.common.pojo.ResponseVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AJ ajin0369@outlook.com
 */
@RestController
public class DemoController {
    @GetMapping("/test")
    public ResponseVO<String> test(){

        return ResponseVO.ok();
    }

    @GetMapping("/test2")
    public AppResponse test2(){

        return AppResponse.success("sas","sasa");
    }

    @GetMapping("/test3")
    public R test23(){

        return R.ok().put("code","200");
    }

    @GetMapping("/test4")
    public ResponseVO<String> test4(){

        return ResponseVO.ok("test2323232");
    }
}
