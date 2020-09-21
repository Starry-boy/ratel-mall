package com.ratel.mall.product.pojo.po;

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
    * 运费模版
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsFeightTemplate")
@Data
@TableName(value = "pms_feight_template")
public class PmsFeightTemplate implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 计费类型:0->按重量；1->按件数
     */
    @TableField(value = "charge_type")
    @ApiModelProperty(value="计费类型:0->按重量；1->按件数")
    private Integer chargeType;

    /**
     * 首重kg
     */
    @TableField(value = "first_weight")
    @ApiModelProperty(value="首重kg")
    private BigDecimal firstWeight;

    /**
     * 首费（元）
     */
    @TableField(value = "first_fee")
    @ApiModelProperty(value="首费（元）")
    private BigDecimal firstFee;

    @TableField(value = "continue_weight")
    @ApiModelProperty(value="")
    private BigDecimal continueWeight;

    @TableField(value = "continme_fee")
    @ApiModelProperty(value="")
    private BigDecimal continmeFee;

    /**
     * 目的地（省、市）
     */
    @TableField(value = "dest")
    @ApiModelProperty(value="目的地（省、市）")
    private String dest;

    private static final long serialVersionUID = 1L;
}