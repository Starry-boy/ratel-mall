package com.ratel.mall.user.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
    * 会员积分成长规则表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsMemberRuleSetting")
@Data
@TableName(value = "ums_member_rule_setting")
public class UmsMemberRuleSetting implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 连续签到天数
     */
    @TableField(value = "continue_sign_day")
    @ApiModelProperty(value="连续签到天数")
    private Integer continueSignDay;

    /**
     * 连续签到赠送数量
     */
    @TableField(value = "continue_sign_point")
    @ApiModelProperty(value="连续签到赠送数量")
    private Integer continueSignPoint;

    /**
     * 每消费多少元获取1个点
     */
    @TableField(value = "consume_per_point")
    @ApiModelProperty(value="每消费多少元获取1个点")
    private BigDecimal consumePerPoint;

    /**
     * 最低获取点数的订单金额
     */
    @TableField(value = "low_order_amount")
    @ApiModelProperty(value="最低获取点数的订单金额")
    private BigDecimal lowOrderAmount;

    /**
     * 每笔订单最高获取点数
     */
    @TableField(value = "max_point_per_order")
    @ApiModelProperty(value="每笔订单最高获取点数")
    private Integer maxPointPerOrder;

    /**
     * 类型：0->积分规则；1->成长值规则
     */
    @TableField(value = "type")
    @ApiModelProperty(value="类型：0->积分规则；1->成长值规则")
    private Integer type;

    private static final long serialVersionUID = 1L;
}