package com.ratel.mall.user.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 会员收货地址表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsMemberReceiveAddress")
@Data
@TableName(value = "ums_member_receive_address")
public class UmsMemberReceiveAddress implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    /**
     * 收货人名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="收货人名称")
    private String name;

    @TableField(value = "phone_number")
    @ApiModelProperty(value="")
    private String phoneNumber;

    /**
     * 是否为默认
     */
    @TableField(value = "default_status")
    @ApiModelProperty(value="是否为默认")
    private Integer defaultStatus;

    /**
     * 邮政编码
     */
    @TableField(value = "post_code")
    @ApiModelProperty(value="邮政编码")
    private String postCode;

    /**
     * 省份/直辖市
     */
    @TableField(value = "province")
    @ApiModelProperty(value="省份/直辖市")
    private String province;

    /**
     * 城市
     */
    @TableField(value = "city")
    @ApiModelProperty(value="城市")
    private String city;

    /**
     * 区
     */
    @TableField(value = "region")
    @ApiModelProperty(value="区")
    private String region;

    /**
     * 详细地址(街道)
     */
    @TableField(value = "detail_address")
    @ApiModelProperty(value="详细地址(街道)")
    private String detailAddress;

    private static final long serialVersionUID = 1L;
}