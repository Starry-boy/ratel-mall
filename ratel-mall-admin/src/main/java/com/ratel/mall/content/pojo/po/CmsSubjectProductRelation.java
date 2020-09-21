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
    * 专题商品关系表
    */
@ApiModel(value="com-ratel-mall-content-pojo-po-CmsSubjectProductRelation")
@Data
@TableName(value = "cms_subject_product_relation")
public class CmsSubjectProductRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "subject_id")
    @ApiModelProperty(value="")
    private Long subjectId;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    private static final long serialVersionUID = 1L;
}