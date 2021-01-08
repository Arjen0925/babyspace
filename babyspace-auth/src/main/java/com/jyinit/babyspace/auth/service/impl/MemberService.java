package com.jyinit.babyspace.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jyinit.babyspace.auth.entity.Member;
import com.jyinit.babyspace.auth.mapper.MemberMapper;
import com.jyinit.babyspace.auth.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author AJ ajin0369@outlook.com
 * @since 2021-01-06
 */
@Service
public class MemberService extends ServiceImpl<MemberMapper, Member> implements IMemberService {

    @Override
    public IPage<Member> getMemberPage() {
        return this.baseMapper.selectPage(new Page<>(1,10),new QueryWrapper<>());
    }

    @Override
    public void save() {
        for(int i=0;i<=100;i++){
            Member member = new Member();
            member.setNickname("test"+i);
            this.baseMapper.insert(member);
        }

    }

    @Override
    public List<Member> getMemberList() {
        return this.baseMapper.selectList(null);
    }
}
