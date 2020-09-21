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
    * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsProductCategoryAttributeRelation")
@Data
@TableName(value = "pms_product_category_attribute_relation")
public class PmsProductCategoryAttributeRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_category_id")
    @ApiModelProperty(value="")
    private Long productCategoryId;

    @TableField(value = "product_attribute_id")
    @ApiModelProperty(value="")
    private Long productAttributeId;

    private static final long serialVersionUID = 1L;
}