package com.ratel.mall.admin.mapstruct;

import com.ratel.mall.admin.pojo.dto.AdminLoginDTO;
import com.ratel.mall.admin.pojo.po.AdminUser;
import com.ratel.mall.admin.pojo.vo.AdminUserVO;
import com.ratel.mall.api.JwtToken;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author ratel
 * @date 2020-09-28
 */
@Mapper(componentModel = "spring")
public interface AdminConvertor {
    JwtToken toJwtToken(AdminLoginDTO adminLoginDTO);

    AdminUser toAdminUser(AdminUserVO adminUserVO);
}
