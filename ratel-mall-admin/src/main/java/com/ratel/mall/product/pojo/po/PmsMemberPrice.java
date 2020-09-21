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
    * 商品会员价格表
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsMemberPrice")
@Data
@TableName(value = "pms_member_price")
public class PmsMemberPrice implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "member_level_id")
    @ApiModelProperty(value="")
    private Long memberLevelId;

    /**
     * 会员价格
     */
    @TableField(value = "member_price")
    @ApiModelProperty(value="会员价格")
    private BigDecimal memberPrice;

    @TableField(value = "member_level_name")
    @ApiModelProperty(value="")
    private String memberLevelName;

    private static final long serialVersionUID = 1L;
}