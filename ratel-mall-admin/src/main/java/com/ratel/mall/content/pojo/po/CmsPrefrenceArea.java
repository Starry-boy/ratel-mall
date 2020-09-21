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
    * 优选专区
    */
@ApiModel(value="com-ratel-mall-content-pojo-po-CmsPrefrenceArea")
@Data
@TableName(value = "cms_prefrence_area")
public class CmsPrefrenceArea implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "sub_title")
    @ApiModelProperty(value="")
    private String subTitle;

    /**
     * 展示图片
     */
    @TableField(value = "pic")
    @ApiModelProperty(value="展示图片")
    private byte[] pic;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    @TableField(value = "show_status")
    @ApiModelProperty(value="")
    private Integer showStatus;

    private static final long serialVersionUID = 1L;
}