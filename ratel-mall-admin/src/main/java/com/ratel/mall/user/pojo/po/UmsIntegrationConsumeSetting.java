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
    * 积分消费设置
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsIntegrationConsumeSetting")
@Data
@TableName(value = "ums_integration_consume_setting")
public class UmsIntegrationConsumeSetting implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 每一元需要抵扣的积分数量
     */
    @TableField(value = "deduction_per_amount")
    @ApiModelProperty(value="每一元需要抵扣的积分数量")
    private Integer deductionPerAmount;

    /**
     * 每笔订单最高抵用百分比
     */
    @TableField(value = "max_percent_per_order")
    @ApiModelProperty(value="每笔订单最高抵用百分比")
    private Integer maxPercentPerOrder;

    /**
     * 每次使用积分最小单位100
     */
    @TableField(value = "use_unit")
    @ApiModelProperty(value="每次使用积分最小单位100")
    private Integer useUnit;

    /**
     * 是否可以和优惠券同用；0->不可以；1->可以
     */
    @TableField(value = "coupon_status")
    @ApiModelProperty(value="是否可以和优惠券同用；0->不可以；1->可以")
    private Integer couponStatus;

    private static final long serialVersionUID = 1L;
}