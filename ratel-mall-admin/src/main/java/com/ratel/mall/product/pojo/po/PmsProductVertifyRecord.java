package com.ratel.mall.product.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 商品审核记录
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsProductVertifyRecord")
@Data
@TableName(value = "pms_product_vertify_record")
public class PmsProductVertifyRecord implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    /**
     * 审核人
     */
    @TableField(value = "vertify_man")
    @ApiModelProperty(value="审核人")
    private String vertifyMan;

    @TableField(value = "status")
    @ApiModelProperty(value="")
    private Integer status;

    /**
     * 反馈详情
     */
    @TableField(value = "detail")
    @ApiModelProperty(value="反馈详情")
    private String detail;

    private static final long serialVersionUID = 1L;
}