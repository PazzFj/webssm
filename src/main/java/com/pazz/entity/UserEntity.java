package com.pazz.entity;

import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

/**
 * @author: 彭坚
 * @create: 2019/1/18 0:19
 * @description:
 */
@Data
@Table(name = "t_user")
public class UserEntity {

    /**
     * 用户登录名
     */
    private String userName;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * PDA密码
     */
    private String pdaPassword;

    /**
     * 姓名
     */
    private String name;
    /**
     * 称谓
     */
    private String title;
    /**
     * 最近登录时间
     */
    private Date lastLogin;
    /**
     * 启用时间
     */
    private Date beginTime;
    /**
     * 结束使用时间
     */
    private Date endTime;
    /**
     * 是否可用
     */
    private String active;
    /**
     * 是否公司员工
     */
    private String isEmp;
    /**
     * 所属组织编码
     */
    private String orgCode;
    /**
     * 员工手机
     */
    private String mobile;
    /**
     * 所属系统编码
     */
    private String belongSystem;
    /**
     * 版本号
     */
    private Long versionNo;

}
