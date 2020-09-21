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
    * 后台用户角色和权限关系表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsRolePermissionRelation")
@Data
@TableName(value = "ums_role_permission_relation")
public class UmsRolePermissionRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "role_id")
    @ApiModelProperty(value="")
    private Long roleId;

    @TableField(value = "permission_id")
    @ApiModelProperty(value="")
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}