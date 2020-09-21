package com.ratel.mall.content.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 话题分类表
    */
@ApiModel(value="com-ratel-mall-content-pojo-po-CmsTopicCategory")
@Data
@TableName(value = "cms_topic_category")
public class CmsTopicCategory implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 分类图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="分类图标")
    private String icon;

    /**
     * 专题数量
     */
    @TableField(value = "subject_count")
    @ApiModelProperty(value="专题数量")
    private Integer subjectCount;

    @TableField(value = "show_status")
    @ApiModelProperty(value="")
    private Integer showStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}