package com.ratel.mall.user.pojo.po;

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
    * 会员统计信息
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsMemberStatisticsInfo")
@Data
@TableName(value = "ums_member_statistics_info")
public class UmsMemberStatisticsInfo implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    /**
     * 累计消费金额
     */
    @TableField(value = "consume_amount")
    @ApiModelProperty(value="累计消费金额")
    private BigDecimal consumeAmount;

    /**
     * 订单数量
     */
    @TableField(value = "order_count")
    @ApiModelProperty(value="订单数量")
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    @TableField(value = "coupon_count")
    @ApiModelProperty(value="优惠券数量")
    private Integer couponCount;

    /**
     * 评价数
     */
    @TableField(value = "comment_count")
    @ApiModelProperty(value="评价数")
    private Integer commentCount;

    /**
     * 退货数量
     */
    @TableField(value = "return_order_count")
    @ApiModelProperty(value="退货数量")
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    @TableField(value = "login_count")
    @ApiModelProperty(value="登录次数")
    private Integer loginCount;

    /**
     * 关注数量
     */
    @TableField(value = "attend_count")
    @ApiModelProperty(value="关注数量")
    private Integer attendCount;

    /**
     * 粉丝数量
     */
    @TableField(value = "fans_count")
    @ApiModelProperty(value="粉丝数量")
    private Integer fansCount;

    @TableField(value = "collect_product_count")
    @ApiModelProperty(value="")
    private Integer collectProductCount;

    @TableField(value = "collect_subject_count")
    @ApiModelProperty(value="")
    private Integer collectSubjectCount;

    @TableField(value = "collect_topic_count")
    @ApiModelProperty(value="")
    private Integer collectTopicCount;

    @TableField(value = "collect_comment_count")
    @ApiModelProperty(value="")
    private Integer collectCommentCount;

    @TableField(value = "invite_friend_count")
    @ApiModelProperty(value="")
    private Integer inviteFriendCount;

    /**
     * 最后一次下订单时间
     */
    @TableField(value = "recent_order_time")
    @ApiModelProperty(value="最后一次下订单时间")
    private Date recentOrderTime;

    private static final long serialVersionUID = 1L;
}