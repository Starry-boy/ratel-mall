package com.ratel.mall.admin.mapstruct;

import com.ratel.mall.admin.pojo.dto.AdminLoginDTO;
import com.ratel.mall.admin.pojo.po.AdminUser;
import com.ratel.mall.admin.pojo.vo.AdminUserVO;
import com.ratel.mall.api.JwtToken;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-28T16:22:21+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class AdminConvertorImpl implements AdminConvertor {

    @Override
    public JwtToken toJwtToken(AdminLoginDTO adminLoginDTO) {
        if ( adminLoginDTO == null ) {
            return null;
        }

        JwtToken jwtToken = new JwtToken();

        jwtToken.setUsername( adminLoginDTO.getUsername() );
        jwtToken.setPassword( adminLoginDTO.getPassword() );

        return jwtToken;
    }

    @Override
    public AdminUser toAdminUser(AdminUserVO adminUserVO) {
        if ( adminUserVO == null ) {
            return null;
        }

        AdminUser adminUser = new AdminUser();

        if ( adminUserVO.getId() != null ) {
            adminUser.setId( Long.parseLong( adminUserVO.getId() ) );
        }
        adminUser.setUsername( adminUserVO.getUsername() );
        adminUser.setPassword( adminUserVO.getPassword() );
        adminUser.setIcon( adminUserVO.getIcon() );
        adminUser.setEmail( adminUserVO.getEmail() );
        adminUser.setNickName( adminUserVO.getNickName() );
        adminUser.setNote( adminUserVO.getNote() );
        adminUser.setCreateTime( adminUserVO.getCreateTime() );
        adminUser.setLoginTime( adminUserVO.getLoginTime() );
        adminUser.setStatus( adminUserVO.getStatus() );

        return adminUser;
    }
}
