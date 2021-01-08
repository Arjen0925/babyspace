package com.jyinit.babyspace.auth.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jyinit.babyspace.auth.entity.Member;
import com.jyinit.babyspace.auth.service.IMemberService;
import com.jyinit.babyspace.common.pojo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 会员 前端控制器
 * </p>
 *
 * @author AJ ajin0369@outlook.com
 * @since 2021-01-06
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private IMemberService iMemberService;

    @GetMapping("/page")
    public ResponseVO<IPage<Member>> memberPage(){
        return  ResponseVO.ok(iMemberService.getMemberPage());
    }


    @GetMapping("/add")
    public ResponseVO<String> save(){
        iMemberService.save();
        return ResponseVO.ok("保存成功");
    }

    @GetMapping("/list")
    public ResponseVO<List<Member>> memberList(){
        return  ResponseVO.ok(iMemberService.getMemberList());
    }
}

