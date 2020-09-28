package com.ratel.mall.config;

import com.ratel.mall.security.realm.DefaultRealm;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ratel
 * @date 2020-05-22
 */
@Slf4j
@Configuration
//@EnableConfigurationProperties(ShiroProperty.class)
public class ShiroConfiguration {

    @Bean
    public Realm realm() {
        DefaultRealm realm = new DefaultRealm();
        return realm;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    @Bean
    public DefaultSecurityManager securityManager(Realm realm, RedisCacheManager redisCacheManager) {
        DefaultSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(realm);
//        securityManager.setRememberMeManager(initJWTTokenManager());
        //添加缓存管理
        securityManager.setCacheManager(redisCacheManager);
        return securityManager;
    }

    @Bean("shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        //登录的 URL
        shiroFilterFactoryBean.setLoginUrl("/login.html");

        //登录成功过跳转的URL
        //shiroFilterFactoryBean.setSuccessUrl("/admin/index.html");

        //未授权URL
        shiroFilterFactoryBean.setUnauthorizedUrl("/error/403");


        //静态资源
        Map<String, String> filterChainMap = new LinkedHashMap<>();
        filterChainMap.put("login", "anon");
        filterChainMap.put("authCode", "anon");
        filterChainMap.put("/swagger-ui.html", "anon");
        filterChainMap.put("/swagger-resources", "anon");
        filterChainMap.put("/v2/api-docs", "anon");
        filterChainMap.put("/webjars/springfox-swagger-ui/**", "anon");

        //登出接口
        filterChainMap.put("/logout", "logout");

        //剩下所有接口都需要拦截
        filterChainMap.put("/**", "auth");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainMap);

        //关闭自带 shiro session
        DefaultSubjectDAO subjectDAO = new DefaultSubjectDAO();
        DefaultSessionStorageEvaluator defaultSessionStorageEvaluator = new DefaultSessionStorageEvaluator();
        defaultSessionStorageEvaluator.setSessionStorageEnabled(false);
        subjectDAO.setSessionStorageEvaluator(defaultSessionStorageEvaluator);
        return shiroFilterFactoryBean;
    }

    public SimpleCookie rememberMeCookie() {
        //设置cookie名称 对应 <input type="checkbox" name= "HydraRememberMe"/>
        SimpleCookie cookie = new SimpleCookie("HydraToken");
        //指定cookie过期时间 单位s
        cookie.setMaxAge(-1);
        return cookie;
    }


    /**
     * @return org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator
     * @Description 指定默认代理 为cglib
     * @Author ratel
     * @Date 2020/7/8
     **/
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

    @Bean
    public FilterRegistrationBean delegatingFilterProxy() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        DelegatingFilterProxy proxy = new DelegatingFilterProxy();
        proxy.setTargetFilterLifecycle(true);
        proxy.setTargetBeanName("shiroFilter");
        filterRegistrationBean.setFilter(proxy);
        return filterRegistrationBean;
    }


    @Bean
    public RedisManager initRedisManager() {
        RedisManager redisManager = new RedisManager();
        redisManager.setHost("129.204.172.25");
        redisManager.setPort(6379);
        redisManager.setPassword("redis@0804");
        return redisManager;
    }

    @Bean
    public RedisCacheManager initRedisCacheManager(RedisManager redisManager) {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager);
        return redisCacheManager;
    }
}
