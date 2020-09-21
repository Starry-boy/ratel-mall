package com.ratel.mall.user.pojo.po;

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
    * 积分变化历史记录表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsIntegrationChangeHistory")
@Data
@TableName(value = "ums_integration_change_history")
public class UmsIntegrationChangeHistory implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    /**
     * 改变类型：0->增加；1->减少
     */
    @TableField(value = "change_type")
    @ApiModelProperty(value="改变类型：0->增加；1->减少")
    private Integer changeType;

    /**
     * 积分改变数量
     */
    @TableField(value = "change_count")
    @ApiModelProperty(value="积分改变数量")
    private Integer changeCount;

    /**
     * 操作人员
     */
    @TableField(value = "operate_man")
    @ApiModelProperty(value="操作人员")
    private String operateMan;

    /**
     * 操作备注
     */
    @TableField(value = "operate_note")
    @ApiModelProperty(value="操作备注")
    private String operateNote;

    /**
     * 积分来源：0->购物；1->管理员修改
     */
    @TableField(value = "source_type")
    @ApiModelProperty(value="积分来源：0->购物；1->管理员修改")
    private Integer sourceType;

    private static final long serialVersionUID = 1L;
}