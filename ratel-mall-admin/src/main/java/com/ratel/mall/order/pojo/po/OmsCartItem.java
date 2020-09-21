package com.ratel.mall.order.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 购物车表
    */
@ApiModel(value="com-ratel-mall-order-pojo-po-OmsCartItem")
@Data
@TableName(value = "oms_cart_item")
public class OmsCartItem implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "product_sku_id")
    @ApiModelProperty(value="")
    private Long productSkuId;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    /**
     * 购买数量
     */
    @TableField(value = "quantity")
    @ApiModelProperty(value="购买数量")
    private Integer quantity;

    /**
     * 添加到购物车的价格
     */
    @TableField(value = "price")
    @ApiModelProperty(value="添加到购物车的价格")
    private BigDecimal price;

    /**
     * 商品主图
     */
    @TableField(value = "product_pic")
    @ApiModelProperty(value="商品主图")
    private String productPic;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
     * 商品副标题（卖点）
     */
    @TableField(value = "product_sub_title")
    @ApiModelProperty(value="商品副标题（卖点）")
    private String productSubTitle;

    /**
     * 商品sku条码
     */
    @TableField(value = "product_sku_code")
    @ApiModelProperty(value="商品sku条码")
    private String productSkuCode;

    /**
     * 会员昵称
     */
    @TableField(value = "member_nickname")
    @ApiModelProperty(value="会员昵称")
    private String memberNickname;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    @ApiModelProperty(value="创建时间")
    private Date createDate;

    /**
     * 修改时间
     */
    @TableField(value = "modify_date")
    @ApiModelProperty(value="修改时间")
    private Date modifyDate;

    /**
     * 是否删除
     */
    @TableField(value = "delete_status")
    @ApiModelProperty(value="是否删除")
    private Integer deleteStatus;

    /**
     * 商品分类
     */
    @TableField(value = "product_category_id")
    @ApiModelProperty(value="商品分类")
    private Long productCategoryId;

    @TableField(value = "product_brand")
    @ApiModelProperty(value="")
    private String productBrand;

    @TableField(value = "product_sn")
    @ApiModelProperty(value="")
    private String productSn;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @TableField(value = "product_attr")
    @ApiModelProperty(value="商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String productAttr;

    private static final long serialVersionUID = 1L;
}