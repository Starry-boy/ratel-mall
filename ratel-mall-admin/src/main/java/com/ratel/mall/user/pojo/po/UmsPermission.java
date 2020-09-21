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
    * 后台用户权限表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsPermission")
@Data
@TableName(value = "ums_permission")
public class UmsPermission implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 父级权限id
     */
    @TableField(value = "pid")
    @ApiModelProperty(value="父级权限id")
    private Long pid;

    /**
     * 名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="名称")
    private String name;

    /**
     * 权限值
     */
    @TableField(value = "value")
    @ApiModelProperty(value="权限值")
    private String value;

    /**
     * 图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="图标")
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    @TableField(value = "type")
    @ApiModelProperty(value="权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    /**
     * 前端资源路径
     */
    @TableField(value = "uri")
    @ApiModelProperty(value="前端资源路径")
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     */
    @TableField(value = "status")
    @ApiModelProperty(value="启用状态；0->禁用；1->启用")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}