package com.ratel.mall.content.pojo.po;

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
    * 话题表
    */
@ApiModel(value="com-ratel-mall-content-pojo-po-CmsTopic")
@Data
@TableName(value = "cms_topic")
public class CmsTopic implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "category_id")
    @ApiModelProperty(value="")
    private Long categoryId;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "start_time")
    @ApiModelProperty(value="")
    private Date startTime;

    @TableField(value = "end_time")
    @ApiModelProperty(value="")
    private Date endTime;

    /**
     * 参与人数
     */
    @TableField(value = "attend_count")
    @ApiModelProperty(value="参与人数")
    private Integer attendCount;

    /**
     * 关注人数
     */
    @TableField(value = "attention_count")
    @ApiModelProperty(value="关注人数")
    private Integer attentionCount;

    @TableField(value = "read_count")
    @ApiModelProperty(value="")
    private Integer readCount;

    /**
     * 奖品名称
     */
    @TableField(value = "award_name")
    @ApiModelProperty(value="奖品名称")
    private String awardName;

    /**
     * 参与方式
     */
    @TableField(value = "attend_type")
    @ApiModelProperty(value="参与方式")
    private String attendType;

    /**
     * 话题内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="话题内容")
    private String content;

    private static final long serialVersionUID = 1L;
}