package com.ratel.mall.api;

import lombok.Data;
import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author ratel
 * @date 2020-09-28
 */
@Data
public class JwtToken implements AuthenticationToken {
    private String token;
    private String username;
    private String password;
    @Override
    public Object getPrincipal() {
        return username;
    }

    @Override
    public Object getCredentials() {
        return password;
    }
}