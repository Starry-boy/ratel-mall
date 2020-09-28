package com.ratel.mall.admin.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author ratel
 * @date 2020-09-28
 */
@ApiModel
@Data
public class AdminLoginDTO {
    @ApiModelProperty(name = "用户名")
    @NotEmpty(message = "用户名不能为空")
    private String username;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 8,max = 24,message = "密码长度必须在8-24位之间")
    @ApiModelProperty(name = "密码")
    private String password;

    @NotEmpty(message = "验证码不能为空")
    @ApiModelProperty(name = "验证码")
    private String authCode;
}
