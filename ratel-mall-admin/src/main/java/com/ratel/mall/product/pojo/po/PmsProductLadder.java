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
    * 产品阶梯价格表(只针对同商品)
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsProductLadder")
@Data
@TableName(value = "pms_product_ladder")
public class PmsProductLadder implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    /**
     * 满足的商品数量
     */
    @TableField(value = "count")
    @ApiModelProperty(value="满足的商品数量")
    private Integer count;

    /**
     * 折扣
     */
    @TableField(value = "discount")
    @ApiModelProperty(value="折扣")
    private BigDecimal discount;

    /**
     * 折后价格
     */
    @TableField(value = "price")
    @ApiModelProperty(value="折后价格")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;
}