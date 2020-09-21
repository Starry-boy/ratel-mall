package com.ratel.mall.product.pojo.po;

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
    * 产品评价回复表
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsCommentReplay")
@Data
@TableName(value = "pms_comment_replay")
public class PmsCommentReplay implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "comment_id")
    @ApiModelProperty(value="")
    private Long commentId;

    @TableField(value = "member_nick_name")
    @ApiModelProperty(value="")
    private String memberNickName;

    @TableField(value = "member_icon")
    @ApiModelProperty(value="")
    private String memberIcon;

    @TableField(value = "content")
    @ApiModelProperty(value="")
    private String content;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    /**
     * 评论人员类型；0->会员；1->管理员
     */
    @TableField(value = "type")
    @ApiModelProperty(value="评论人员类型；0->会员；1->管理员")
    private Integer type;

    private static final long serialVersionUID = 1L;
}