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
    * 优惠券和产品分类关系表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsCouponProductCategoryRelation")
@Data
@TableName(value = "sms_coupon_product_category_relation")
public class SmsCouponProductCategoryRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "coupon_id")
    @ApiModelProperty(value="")
    private Long couponId;

    @TableField(value = "product_category_id")
    @ApiModelProperty(value="")
    private Long productCategoryId;

    /**
     * 产品分类名称
     */
    @TableField(value = "product_category_name")
    @ApiModelProperty(value="产品分类名称")
    private String productCategoryName;

    /**
     * 父分类名称
     */
    @TableField(value = "parent_category_name")
    @ApiModelProperty(value="父分类名称")
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;
}