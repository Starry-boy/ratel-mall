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
 * 商品评价表
 */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsComment")
@Data
@TableName(value = "pms_comment")
public class PmsComment implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "member_nick_name")
    @ApiModelProperty(value="")
    private String memberNickName;

    @TableField(value = "product_name")
    @ApiModelProperty(value="")
    private String productName;

    /**
     * 评价星数：0->5
     */
    @TableField(value = "star")
    @ApiModelProperty(value="评价星数：0->5")
    private Integer star;

    /**
     * 评价的ip
     */
    @TableField(value = "member_ip")
    @ApiModelProperty(value="评价的ip")
    private String memberIp;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "show_status")
    @ApiModelProperty(value="")
    private Integer showStatus;

    /**
     * 购买时的商品属性
     */
    @TableField(value = "product_attribute")
    @ApiModelProperty(value="购买时的商品属性")
    private String productAttribute;

    @TableField(value = "collect_couont")
    @ApiModelProperty(value="")
    private Integer collectCouont;

    @TableField(value = "read_count")
    @ApiModelProperty(value="")
    private Integer readCount;

    @TableField(value = "content")
    @ApiModelProperty(value="")
    private String content;

    /**
     * 上传图片地址，以逗号隔开
     */
    @TableField(value = "pics")
    @ApiModelProperty(value="上传图片地址，以逗号隔开")
    private String pics;

    /**
     * 评论用户头像
     */
    @TableField(value = "member_icon")
    @ApiModelProperty(value="评论用户头像")
    private String memberIcon;

    @TableField(value = "replay_count")
    @ApiModelProperty(value="")
    private Integer replayCount;

    private static final long serialVersionUID = 1L;
}