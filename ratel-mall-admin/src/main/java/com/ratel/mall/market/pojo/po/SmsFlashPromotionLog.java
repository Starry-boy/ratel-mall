package com.ratel.mall.market.pojo.po;

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
    * 限时购通知记录
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsFlashPromotionLog")
@Data
@TableName(value = "sms_flash_promotion_log")
public class SmsFlashPromotionLog implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Integer memberId;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "member_phone")
    @ApiModelProperty(value="")
    private String memberPhone;

    @TableField(value = "product_name")
    @ApiModelProperty(value="")
    private String productName;

    /**
     * 会员订阅时间
     */
    @TableField(value = "subscribe_time")
    @ApiModelProperty(value="会员订阅时间")
    private Date subscribeTime;

    @TableField(value = "send_time")
    @ApiModelProperty(value="")
    private Date sendTime;

    private static final long serialVersionUID = 1L;
}