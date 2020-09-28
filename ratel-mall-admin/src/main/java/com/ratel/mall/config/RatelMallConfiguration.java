package com.ratel.mall.config;

import com.ratel.mall.properties.CaptchaProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ratel
 * @date 2020-09-28
 */
@Configuration
public class RatelMallConfiguration {

    @Bean
    public CaptchaProperty captchaProperty(){
        return new CaptchaProperty();
    }
}
