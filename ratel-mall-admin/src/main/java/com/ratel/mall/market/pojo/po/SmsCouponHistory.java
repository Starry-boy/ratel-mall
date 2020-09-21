package com.ratel.mall.market.pojo.po;

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
    * 优惠券使用、领取历史表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsCouponHistory")
@Data
@TableName(value = "sms_coupon_history")
public class SmsCouponHistory implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "coupon_id")
    @ApiModelProperty(value="")
    private Long couponId;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    @TableField(value = "coupon_code")
    @ApiModelProperty(value="")
    private String couponCode;

    /**
     * 领取人昵称
     */
    @TableField(value = "member_nickname")
    @ApiModelProperty(value="领取人昵称")
    private String memberNickname;

    /**
     * 获取类型：0->后台赠送；1->主动获取
     */
    @TableField(value = "get_type")
    @ApiModelProperty(value="获取类型：0->后台赠送；1->主动获取")
    private Integer getType;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    /**
     * 使用状态：0->未使用；1->已使用；2->已过期
     */
    @TableField(value = "use_status")
    @ApiModelProperty(value="使用状态：0->未使用；1->已使用；2->已过期")
    private Integer useStatus;

    /**
     * 使用时间
     */
    @TableField(value = "use_time")
    @ApiModelProperty(value="使用时间")
    private Date useTime;

    /**
     * 订单编号
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="订单编号")
    private Long orderId;

    /**
     * 订单号码
     */
    @TableField(value = "order_sn")
    @ApiModelProperty(value="订单号码")
    private String orderSn;

    private static final long serialVersionUID = 1L;
}