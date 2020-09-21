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
    * 产品满减表(只针对同商品)
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsProductFullReduction")
@Data
@TableName(value = "pms_product_full_reduction")
public class PmsProductFullReduction implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "full_price")
    @ApiModelProperty(value="")
    private BigDecimal fullPrice;

    @TableField(value = "reduce_price")
    @ApiModelProperty(value="")
    private BigDecimal reducePrice;

    private static final long serialVersionUID = 1L;
}