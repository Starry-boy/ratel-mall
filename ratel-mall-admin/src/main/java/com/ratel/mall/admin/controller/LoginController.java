package com.ratel.mall.admin.controller;

import com.ratel.mall.admin.mapstruct.AdminConvertor;
import com.ratel.mall.admin.pojo.dto.AdminLoginDTO;
import com.ratel.mall.admin.pojo.po.AdminUser;
import com.ratel.mall.admin.pojo.vo.AdminUserVO;
import com.ratel.mall.admin.service.AdminUserService;
import com.ratel.mall.api.PageDTO;
import com.ratel.mall.api.R;
import com.ratel.mall.properties.CaptchaProperty;
import com.ratel.mall.utils.JsonUtil;
import com.wf.captcha.GifCaptcha;
import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.base.Captcha;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author ratel
 * @date 2020-09-28
 */
@Slf4j
@RestController
@Api(tags = "LoginController", description = "用户登录、注册接口")
@RequestMapping("admin")
public class LoginController {
    @Autowired
    private AdminConvertor adminConvertor;

    @Autowired
    private AdminUserService adminUserService;

    @Autowired
    private CaptchaProperty captchaProperty;

    @PostMapping("login")
    @ApiOperation(value = "用户登录")
    public R login(@RequestBody @Valid @NotNull AdminLoginDTO adminLoginDTO) {
        log.info("用户登录入参：{}", JsonUtil.jsonToString(adminLoginDTO));

        Subject subject = SecurityUtils.getSubject();
        subject.login(adminConvertor.toJwtToken(adminLoginDTO));

        return R.ok();
    }

    @GetMapping("authCode")
    @ApiOperation(value = "验证码")
    public void authCode(HttpServletRequest request, HttpServletResponse response) {
        Captcha captcha = null;
        if ("git".equalsIgnoreCase(captchaProperty.getType())) {
            response.setContentType(MediaType.IMAGE_GIF_VALUE);
            captcha = new GifCaptcha(captchaProperty.getWidth(), captchaProperty.getHeight(), captchaProperty.getLength());
        } else {
            response.setContentType(MediaType.IMAGE_PNG_VALUE);
            captcha = new SpecCaptcha(captchaProperty.getWidth(), captchaProperty.getHeight(), captchaProperty.getLength());
        }
        response.setHeader(HttpHeaders.PRAGMA, "No-cache");
        response.setHeader(HttpHeaders.CACHE_CONTROL, "No-cache");
        response.setDateHeader(HttpHeaders.EXPIRES, 0L);
        captcha.setCharType(captcha.getCharType());
        HttpSession session = request.getSession();
        session.setAttribute(CaptchaProperty.CAPTCHA, captcha.text().toLowerCase());
        try {
            captcha.out(response.getOutputStream());
        } catch (Exception e) {
            log.error("返回验证码IO异常", e);
        }
    }

    @PostMapping("save")
    @ApiOperation(value = "保存管理用户")
    public R add(@RequestBody @NotNull AdminUserVO adminUserVO) {
        log.info("添加管理用户入参：{}", JsonUtil.jsonToString(adminUserVO));

        AdminUser adminUser = adminConvertor.toAdminUser(adminUserVO);
        if (StringUtils.isEmpty(adminUserVO.getId())) {
            adminUserService.add(adminUser);
        } else {
            adminUserService.modify(adminUser);
        }
        return R.ok();
    }

    @PostMapping("del/{id}")
    @ApiOperation(value = "删除管理用户")
    public R add(@PathVariable("id") @NotEmpty(message = "id不能为空") String id) {
        log.info("删除管理用户入参：{}", id);
        adminUserService.del(id);
        return R.ok();
    }

    @GetMapping("page")
    @ApiOperation("分页获取管理用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPage", value = "当前页"),
            @ApiImplicitParam(name = "pageSize", value = "分页大小")
    })
    public R page(@RequestParam(defaultValue = "1") Integer currentPage,
                  @RequestParam(defaultValue = "50") Integer pageSize, AdminUserVO adminUserVO) {
        log.info("分页获取管理用户 入参：currentPage:{},pageSize:{},adminUserVO:{}", currentPage, pageSize, JsonUtil.jsonToString(adminUserVO));
        return R.ok(adminUserService.page(new PageDTO<AdminUser>(currentPage, pageSize, adminConvertor.toAdminUser(adminUserVO))));
    }
}
