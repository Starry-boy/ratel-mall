package com.ratel.mall.user.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 会员与产品分类关系表（用户喜欢的分类）
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsMemberProductCategoryRelation")
@Data
@TableName(value = "ums_member_product_category_relation")
public class UmsMemberProductCategoryRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    @TableField(value = "product_category_id")
    @ApiModelProperty(value="")
    private Long productCategoryId;

    private static final long serialVersionUID = 1L;
}