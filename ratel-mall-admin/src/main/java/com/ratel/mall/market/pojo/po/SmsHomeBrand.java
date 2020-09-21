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
    * 首页推荐品牌表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsHomeBrand")
@Data
@TableName(value = "sms_home_brand")
public class SmsHomeBrand implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "brand_id")
    @ApiModelProperty(value="")
    private Long brandId;

    @TableField(value = "brand_name")
    @ApiModelProperty(value="")
    private String brandName;

    @TableField(value = "recommend_status")
    @ApiModelProperty(value="")
    private Integer recommendStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}