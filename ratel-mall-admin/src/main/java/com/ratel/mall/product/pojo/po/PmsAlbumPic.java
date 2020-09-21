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
    * 画册图片表
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsAlbumPic")
@Data
@TableName(value = "pms_album_pic")
public class PmsAlbumPic implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "album_id")
    @ApiModelProperty(value="")
    private Long albumId;

    @TableField(value = "pic")
    @ApiModelProperty(value="")
    private String pic;

    private static final long serialVersionUID = 1L;
}