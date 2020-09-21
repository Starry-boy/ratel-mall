package com.ratel.mall.market.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
    * 商品限时购与商品关系表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsFlashPromotionProductRelation")
@Data
@TableName(value = "sms_flash_promotion_product_relation")
public class SmsFlashPromotionProductRelation implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="编号")
    private Long id;

    @TableField(value = "flash_promotion_id")
    @ApiModelProperty(value="")
    private Long flashPromotionId;

    /**
     * 编号
     */
    @TableField(value = "flash_promotion_session_id")
    @ApiModelProperty(value="编号")
    private Long flashPromotionSessionId;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    /**
     * 限时购价格
     */
    @TableField(value = "flash_promotion_price")
    @ApiModelProperty(value="限时购价格")
    private BigDecimal flashPromotionPrice;

    /**
     * 限时购数量
     */
    @TableField(value = "flash_promotion_count")
    @ApiModelProperty(value="限时购数量")
    private Integer flashPromotionCount;

    /**
     * 每人限购数量
     */
    @TableField(value = "flash_promotion_limit")
    @ApiModelProperty(value="每人限购数量")
    private Integer flashPromotionLimit;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}