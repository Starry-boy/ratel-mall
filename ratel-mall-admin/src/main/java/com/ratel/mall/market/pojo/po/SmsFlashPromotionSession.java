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
    * 限时购场次表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsFlashPromotionSession")
@Data
@TableName(value = "sms_flash_promotion_session")
public class SmsFlashPromotionSession implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="编号")
    private Long id;

    /**
     * 场次名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="场次名称")
    private String name;

    /**
     * 每日开始时间
     */
    @TableField(value = "start_time")
    @ApiModelProperty(value="每日开始时间")
    private Date startTime;

    /**
     * 每日结束时间
     */
    @TableField(value = "end_time")
    @ApiModelProperty(value="每日结束时间")
    private Date endTime;

    /**
     * 启用状态：0->不启用；1->启用
     */
    @TableField(value = "status")
    @ApiModelProperty(value="启用状态：0->不启用；1->启用")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}