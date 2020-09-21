package com.ratel.mall.product.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 产品属性分类表
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsProductAttributeCategory")
@Data
@TableName(value = "pms_product_attribute_category")
public class PmsProductAttributeCategory implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 属性数量
     */
    @TableField(value = "attribute_count")
    @ApiModelProperty(value="属性数量")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @TableField(value = "param_count")
    @ApiModelProperty(value="参数数量")
    private Integer paramCount;

    private static final long serialVersionUID = 1L;
}