package com.ratel.mall.product.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-ratel-mall-product-pojo-po-PmsProductOperateLog")
@Data
@TableName(value = "pms_product_operate_log")
public class PmsProductOperateLog implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "price_old")
    @ApiModelProperty(value="")
    private BigDecimal priceOld;

    @TableField(value = "price_new")
    @ApiModelProperty(value="")
    private BigDecimal priceNew;

    @TableField(value = "sale_price_old")
    @ApiModelProperty(value="")
    private BigDecimal salePriceOld;

    @TableField(value = "sale_price_new")
    @ApiModelProperty(value="")
    private BigDecimal salePriceNew;

    /**
     * 赠送的积分
     */
    @TableField(value = "gift_point_old")
    @ApiModelProperty(value="赠送的积分")
    private Integer giftPointOld;

    @TableField(value = "gift_point_new")
    @ApiModelProperty(value="")
    private Integer giftPointNew;

    @TableField(value = "use_point_limit_old")
    @ApiModelProperty(value="")
    private Integer usePointLimitOld;

    @TableField(value = "use_point_limit_new")
    @ApiModelProperty(value="")
    private Integer usePointLimitNew;

    /**
     * 操作人
     */
    @TableField(value = "operate_man")
    @ApiModelProperty(value="操作人")
    private String operateMan;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}