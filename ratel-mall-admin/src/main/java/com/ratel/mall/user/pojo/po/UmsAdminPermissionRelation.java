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
    * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsAdminPermissionRelation")
@Data
@TableName(value = "ums_admin_permission_relation")
public class UmsAdminPermissionRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "admin_id")
    @ApiModelProperty(value="")
    private Long adminId;

    @TableField(value = "permission_id")
    @ApiModelProperty(value="")
    private Long permissionId;

    @TableField(value = "type")
    @ApiModelProperty(value="")
    private Integer type;

    private static final long serialVersionUID = 1L;
}