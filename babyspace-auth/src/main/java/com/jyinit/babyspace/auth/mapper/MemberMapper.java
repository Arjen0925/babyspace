package com.jyinit.babyspace.auth.mapper;

import com.jyinit.babyspace.auth.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 会员 Mapper 接口
 * </p>
 *
 * @author AJ ajin0369@outlook.com
 * @since 2021-01-06
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {

}
