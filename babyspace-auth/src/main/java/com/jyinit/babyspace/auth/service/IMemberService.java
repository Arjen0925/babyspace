package com.jyinit.babyspace.auth.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jyinit.babyspace.auth.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 会员 服务类
 * </p>
 *
 * @author AJ ajin0369@outlook.com
 * @since 2021-01-06
 */
public interface IMemberService extends IService<Member> {

    IPage<Member> getMemberPage();

    void save();
    List<Member> getMemberList();


}
