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
    * 后台用户和角色关系表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsAdminRoleRelation")
@Data
@TableName(value = "ums_admin_role_relation")
public class UmsAdminRoleRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "admin_id")
    @ApiModelProperty(value="")
    private Long adminId;

    @TableField(value = "role_id")
    @ApiModelProperty(value="")
    private Long roleId;

    private static final long serialVersionUID = 1L;
}