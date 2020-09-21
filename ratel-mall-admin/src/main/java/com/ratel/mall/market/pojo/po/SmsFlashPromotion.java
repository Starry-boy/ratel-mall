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
    * 限时购表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsFlashPromotion")
@Data
@TableName(value = "sms_flash_promotion")
public class SmsFlashPromotion implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "title")
    @ApiModelProperty(value="")
    private String title;

    /**
     * 开始日期
     */
    @TableField(value = "start_date")
    @ApiModelProperty(value="开始日期")
    private Date startDate;

    /**
     * 结束日期
     */
    @TableField(value = "end_date")
    @ApiModelProperty(value="结束日期")
    private Date endDate;

    /**
     * 上下线状态
     */
    @TableField(value = "status")
    @ApiModelProperty(value="上下线状态")
    private Integer status;

    /**
     * 秒杀时间段名称
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="秒杀时间段名称")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}