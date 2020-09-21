package com.ratel.mall.market.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 优惠券和产品的关系表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsCouponProductRelation")
@Data
@TableName(value = "sms_coupon_product_relation")
public class SmsCouponProductRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "coupon_id")
    @ApiModelProperty(value="")
    private Long couponId;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
     * 商品编码
     */
    @TableField(value = "product_sn")
    @ApiModelProperty(value="商品编码")
    private String productSn;

    private static final long serialVersionUID = 1L;
}