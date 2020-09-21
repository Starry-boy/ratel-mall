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
    * 帮助表
    */
@ApiModel(value="com-ratel-mall-content-pojo-po-CmsHelp")
@Data
@TableName(value = "cms_help")
public class CmsHelp implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "category_id")
    @ApiModelProperty(value="")
    private Long categoryId;

    @TableField(value = "icon")
    @ApiModelProperty(value="")
    private String icon;

    @TableField(value = "title")
    @ApiModelProperty(value="")
    private String title;

    @TableField(value = "show_status")
    @ApiModelProperty(value="")
    private Integer showStatus;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "read_count")
    @ApiModelProperty(value="")
    private Integer readCount;

    @TableField(value = "content")
    @ApiModelProperty(value="")
    private String content;

    private static final long serialVersionUID = 1L;
}