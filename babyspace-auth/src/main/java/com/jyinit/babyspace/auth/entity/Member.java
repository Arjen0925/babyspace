package com.jyinit.babyspace.auth.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.jyinit.babyspace.common.pojo.BaseDO;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 会员
 * </p>
 *
 * @author AJ ajin0369@outlook.com
 * @since 2021-01-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("bs_member")
public class Member extends BaseDO {

    private static final long serialVersionUID = 1L;

    /**
     * 会员等级id
     */
    @TableField("level_id")
    private Long levelId;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 手机号码
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 头像
     */
    @TableField("header")
    private String header;

    /**
     * 性别
     */
    @TableField("gender")
    private Integer gender;

    /**
     * 生日
     */
    @TableField("birth")
    private LocalDate birth;

    /**
     * 所在城市
     */
    @TableField("city")
    private String city;

    /**
     * 职业
     */
    @TableField("job")
    private String job;

    /**
     * 个性签名
     */
    @TableField("sign")
    private String sign;

    /**
     * 用户来源
     */
    @TableField("source_type")
    private Integer sourceType;

    /**
     * 积分
     */
    @TableField("integration")
    private Integer integration;

    /**
     * 成长值
     */
    @TableField("growth")
    private Integer growth;

    /**
     * 启用状态
     */
    @TableField("status")
    private Integer status;

    /**
     * 注册时间
     */
    @TableField("reg_time")
    private LocalDateTime regTime;


}
