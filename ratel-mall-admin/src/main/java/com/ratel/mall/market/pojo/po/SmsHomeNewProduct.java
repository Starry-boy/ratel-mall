package com.ratel.mall.market.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 新鲜好物表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsHomeNewProduct")
@Data
@TableName(value = "sms_home_new_product")
public class SmsHomeNewProduct implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "product_name")
    @ApiModelProperty(value="")
    private String productName;

    @TableField(value = "recommend_status")
    @ApiModelProperty(value="")
    private Integer recommendStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}