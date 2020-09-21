package com.ratel.mall.content.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 优选专区和产品关系表
    */
@ApiModel(value="com-ratel-mall-content-pojo-po-CmsPrefrenceAreaProductRelation")
@Data
@TableName(value = "cms_prefrence_area_product_relation")
public class CmsPrefrenceAreaProductRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "prefrence_area_id")
    @ApiModelProperty(value="")
    private Long prefrenceAreaId;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    private static final long serialVersionUID = 1L;
}