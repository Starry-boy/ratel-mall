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
    * 会员登录记录
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsMemberLoginLog")
@Data
@TableName(value = "ums_member_login_log")
public class UmsMemberLoginLog implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "ip")
    @ApiModelProperty(value="")
    private String ip;

    @TableField(value = "city")
    @ApiModelProperty(value="")
    private String city;

    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    @TableField(value = "login_type")
    @ApiModelProperty(value="登录类型：0->PC；1->android;2->ios;3->小程序")
    private Integer loginType;

    @TableField(value = "province")
    @ApiModelProperty(value="")
    private String province;

    private static final long serialVersionUID = 1L;
}