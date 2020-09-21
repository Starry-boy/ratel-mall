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
    * 存储产品参数信息的表
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsProductAttributeValue")
@Data
@TableName(value = "pms_product_attribute_value")
public class PmsProductAttributeValue implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "product_attribute_id")
    @ApiModelProperty(value="")
    private Long productAttributeId;

    /**
     * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    @TableField(value = "value")
    @ApiModelProperty(value="手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;

    private static final long serialVersionUID = 1L;
}