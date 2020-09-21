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
    * 后台角色菜单关系表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsRoleMenuRelation")
@Data
@TableName(value = "ums_role_menu_relation")
public class UmsRoleMenuRelation implements Serializable {
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
     * 菜单ID
     */
    @TableField(value = "menu_id")
    @ApiModelProperty(value="菜单ID")
    private Long menuId;

    private static final long serialVersionUID = 1L;
}