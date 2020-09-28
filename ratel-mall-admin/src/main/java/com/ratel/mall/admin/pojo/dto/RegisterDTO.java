package com.ratel.mall.admin.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ratel
 * @date 2020-09-28
 */
@Data
@ApiModel
public class RegisterDTO {
    @ApiModelProperty(name = "用户名")
    private String username;
    @ApiModelProperty(name = "年龄")
    private Integer age;
    @ApiModelProperty(name = "密码")
    private String password;
    @ApiModelProperty(name = "邮箱")
    private String email;
    @ApiModelProperty(name = "手机号码")
    private String mobile;
}
