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
    * 专题评论表
    */
@ApiModel(value="com-ratel-mall-content-pojo-po-CmsSubjectComment")
@Data
@TableName(value = "cms_subject_comment")
public class CmsSubjectComment implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "subject_id")
    @ApiModelProperty(value="")
    private Long subjectId;

    @TableField(value = "member_nick_name")
    @ApiModelProperty(value="")
    private String memberNickName;

    @TableField(value = "member_icon")
    @ApiModelProperty(value="")
    private String memberIcon;

    @TableField(value = "content")
    @ApiModelProperty(value="")
    private String content;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "show_status")
    @ApiModelProperty(value="")
    private Integer showStatus;

    private static final long serialVersionUID = 1L;
}