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
    * 专题表
    */
@ApiModel(value="com-ratel-mall-content-pojo-po-CmsSubject")
@Data
@TableName(value = "cms_subject")
public class CmsSubject implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "category_id")
    @ApiModelProperty(value="")
    private Long categoryId;

    @TableField(value = "title")
    @ApiModelProperty(value="")
    private String title;

    /**
     * 专题主图
     */
    @TableField(value = "pic")
    @ApiModelProperty(value="专题主图")
    private String pic;

    /**
     * 关联产品数量
     */
    @TableField(value = "product_count")
    @ApiModelProperty(value="关联产品数量")
    private Integer productCount;

    @TableField(value = "recommend_status")
    @ApiModelProperty(value="")
    private Integer recommendStatus;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "collect_count")
    @ApiModelProperty(value="")
    private Integer collectCount;

    @TableField(value = "read_count")
    @ApiModelProperty(value="")
    private Integer readCount;

    @TableField(value = "comment_count")
    @ApiModelProperty(value="")
    private Integer commentCount;

    /**
     * 画册图片用逗号分割
     */
    @TableField(value = "album_pics")
    @ApiModelProperty(value="画册图片用逗号分割")
    private String albumPics;

    @TableField(value = "description")
    @ApiModelProperty(value="")
    private String description;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField(value = "show_status")
    @ApiModelProperty(value="显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @TableField(value = "content")
    @ApiModelProperty(value="")
    private String content;

    /**
     * 转发数
     */
    @TableField(value = "forward_count")
    @ApiModelProperty(value="转发数")
    private Integer forwardCount;

    /**
     * 专题分类名称
     */
    @TableField(value = "category_name")
    @ApiModelProperty(value="专题分类名称")
    private String categoryName;

    private static final long serialVersionUID = 1L;
}