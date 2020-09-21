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
    * 后台角色资源关系表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsRoleResourceRelation")
@Data
@TableName(value = "ums_role_resource_relation")
public class UmsRoleResourceRelation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    @ApiModelProperty(value="角色ID")
    private Long roleId;

    /**
     * 资源ID
     */
    @TableField(value = "resource_id")
    @ApiModelProperty(value="资源ID")
    private Long resourceId;

    private static final long serialVersionUID = 1L;
}