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
    * 产品分类
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsProductCategory")
@Data
@TableName(value = "pms_product_category")
public class PmsProductCategory implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 上级分类的编号：0表示一级分类
     */
    @TableField(value = "parent_id")
    @ApiModelProperty(value="上级分类的编号：0表示一级分类")
    private Long parentId;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    @TableField(value = "level")
    @ApiModelProperty(value="分类级别：0->1级；1->2级")
    private Integer level;

    @TableField(value = "product_count")
    @ApiModelProperty(value="")
    private Integer productCount;

    @TableField(value = "product_unit")
    @ApiModelProperty(value="")
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @TableField(value = "nav_status")
    @ApiModelProperty(value="是否显示在导航栏：0->不显示；1->显示")
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField(value = "show_status")
    @ApiModelProperty(value="显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    /**
     * 图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="图标")
    private String icon;

    @TableField(value = "keywords")
    @ApiModelProperty(value="")
    private String keywords;

    /**
     * 描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value="描述")
    private String description;

    private static final long serialVersionUID = 1L;
}