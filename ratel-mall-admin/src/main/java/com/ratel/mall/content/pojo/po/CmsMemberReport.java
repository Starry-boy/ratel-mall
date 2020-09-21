package com.ratel.mall.content.pojo.po;

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
    * 用户举报表
    */
@ApiModel(value="com-ratel-mall-content-pojo-po-CmsMemberReport")
@Data
@TableName(value = "cms_member_report")
public class CmsMemberReport implements Serializable {
    @TableField(value = "id")
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 举报类型：0->商品评价；1->话题内容；2->用户评论
     */
    @TableField(value = "report_type")
    @ApiModelProperty(value="举报类型：0->商品评价；1->话题内容；2->用户评论")
    private Integer reportType;

    /**
     * 举报人
     */
    @TableField(value = "report_member_name")
    @ApiModelProperty(value="举报人")
    private String reportMemberName;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "report_object")
    @ApiModelProperty(value="")
    private String reportObject;

    /**
     * 举报状态：0->未处理；1->已处理
     */
    @TableField(value = "report_status")
    @ApiModelProperty(value="举报状态：0->未处理；1->已处理")
    private Integer reportStatus;

    /**
     * 处理结果：0->无效；1->有效；2->恶意
     */
    @TableField(value = "handle_status")
    @ApiModelProperty(value="处理结果：0->无效；1->有效；2->恶意")
    private Integer handleStatus;

    @TableField(value = "note")
    @ApiModelProperty(value="")
    private String note;

    private static final long serialVersionUID = 1L;
}