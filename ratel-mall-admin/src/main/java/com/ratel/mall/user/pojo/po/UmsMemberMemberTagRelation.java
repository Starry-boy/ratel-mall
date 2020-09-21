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
    * 用户和标签关系表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsMemberMemberTagRelation")
@Data
@TableName(value = "ums_member_member_tag_relation")
public class UmsMemberMemberTagRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    @TableField(value = "tag_id")
    @ApiModelProperty(value="")
    private Long tagId;

    private static final long serialVersionUID = 1L;
}