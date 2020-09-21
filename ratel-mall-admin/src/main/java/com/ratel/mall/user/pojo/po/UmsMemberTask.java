package com.ratel.mall.user.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 会员任务表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsMemberTask")
@Data
@TableName(value = "ums_member_task")
public class UmsMemberTask implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 赠送成长值
     */
    @TableField(value = "growth")
    @ApiModelProperty(value="赠送成长值")
    private Integer growth;

    /**
     * 赠送积分
     */
    @TableField(value = "intergration")
    @ApiModelProperty(value="赠送积分")
    private Integer intergration;

    /**
     * 任务类型：0->新手任务；1->日常任务
     */
    @TableField(value = "type")
    @ApiModelProperty(value="任务类型：0->新手任务；1->日常任务")
    private Integer type;

    private static final long serialVersionUID = 1L;
}