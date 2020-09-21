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
    * 人气推荐商品表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsHomeRecommendProduct")
@Data
@TableName(value = "sms_home_recommend_product")
public class SmsHomeRecommendProduct implements Serializable {
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