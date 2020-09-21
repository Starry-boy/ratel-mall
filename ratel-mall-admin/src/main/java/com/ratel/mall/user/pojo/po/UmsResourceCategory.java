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
    * 资源分类表
    */
@ApiModel(value="com-ratel-mall-user-pojo-po-UmsResourceCategory")
@Data
@TableName(value = "ums_resource_category")
public class UmsResourceCategory implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 分类名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="分类名称")
    private String name;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}