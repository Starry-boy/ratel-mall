package com.ratel.mall.user.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 会员表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsMember")
@Data
@TableName(value = "ums_member")
public class UmsMember implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "member_level_id")
    @ApiModelProperty(value="")
    private Long memberLevelId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    @ApiModelProperty(value="用户名")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    @ApiModelProperty(value="密码")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    @ApiModelProperty(value="昵称")
    private String nickname;

    /**
     * 手机号码
     */
    @TableField(value = "phone")
    @ApiModelProperty(value="手机号码")
    private String phone;

    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    @TableField(value = "status")
    @ApiModelProperty(value="帐号启用状态:0->禁用；1->启用")
    private Integer status;

    /**
     * 注册时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="注册时间")
    private Date createTime;

    /**
     * 头像
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="头像")
    private String icon;

    /**
     * 性别：0->未知；1->男；2->女
     */
    @TableField(value = "gender")
    @ApiModelProperty(value="性别：0->未知；1->男；2->女")
    private Integer gender;

    /**
     * 生日
     */
    @TableField(value = "birthday")
    @ApiModelProperty(value="生日")
    private Date birthday;

    /**
     * 所做城市
     */
    @TableField(value = "city")
    @ApiModelProperty(value="所做城市")
    private String city;

    /**
     * 职业
     */
    @TableField(value = "job")
    @ApiModelProperty(value="职业")
    private String job;

    /**
     * 个性签名
     */
    @TableField(value = "personalized_signature")
    @ApiModelProperty(value="个性签名")
    private String personalizedSignature;

    /**
     * 用户来源
     */
    @TableField(value = "source_type")
    @ApiModelProperty(value="用户来源")
    private Integer sourceType;

    /**
     * 积分
     */
    @TableField(value = "integration")
    @ApiModelProperty(value="积分")
    private Integer integration;

    /**
     * 成长值
     */
    @TableField(value = "growth")
    @ApiModelProperty(value="成长值")
    private Integer growth;

    /**
     * 剩余抽奖次数
     */
    @TableField(value = "luckey_count")
    @ApiModelProperty(value="剩余抽奖次数")
    private Integer luckeyCount;

    /**
     * 历史积分数量
     */
    @TableField(value = "history_integration")
    @ApiModelProperty(value="历史积分数量")
    private Integer historyIntegration;

    private static final long serialVersionUID = 1L;
}