package com.ratel.mall.product.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 相册表
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsAlbum")
@Data
@TableName(value = "pms_album")
public class PmsAlbum implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "cover_pic")
    @ApiModelProperty(value="")
    private String coverPic;

    @TableField(value = "pic_count")
    @ApiModelProperty(value="")
    private Integer picCount;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    @TableField(value = "description")
    @ApiModelProperty(value="")
    private String description;

    private static final long serialVersionUID = 1L;
}