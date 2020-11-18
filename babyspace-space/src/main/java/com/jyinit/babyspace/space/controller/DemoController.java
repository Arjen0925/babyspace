package com.jyinit.babyspace.space.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AJ ajin0369@outlook.com
 */
@RestController
public class DemoController {
    @GetMapping("/test")
    public String test(){

        return "This is a test!";
    }
}
