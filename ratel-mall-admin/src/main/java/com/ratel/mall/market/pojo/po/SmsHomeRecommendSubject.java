package com.ratel.mall.market.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 首页推荐专题表
    */
@ApiModel(value="com-ratel-mall-market-pojo-po-SmsHomeRecommendSubject")
@Data
@TableName(value = "sms_home_recommend_subject")
public class SmsHomeRecommendSubject implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "subject_id")
    @ApiModelProperty(value="")
    private Long subjectId;

    @TableField(value = "subject_name")
    @ApiModelProperty(value="")
    private String subjectName;

    @TableField(value = "recommend_status")
    @ApiModelProperty(value="")
    private Integer recommendStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}