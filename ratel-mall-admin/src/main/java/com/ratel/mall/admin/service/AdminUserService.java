package com.ratel.mall.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ratel.mall.admin.pojo.po.AdminUser;
import com.ratel.mall.admin.pojo.vo.AdminUserVO;
import com.ratel.mall.api.PageDTO;
import org.springframework.lang.NonNull;

/**
 * @author ratel
 * @date 2020-09-28
 */
public interface AdminUserService {
    /**
     * @Description 添加管理用户
     * @Author      ratel
     * @Date        2020-09-28
     * @param       adminUser
     * @return      void
     **/
    void add(@NonNull AdminUser adminUser);

    /**
     * @Description 修改管理用户
     * @Author      ratel
     * @Date        2020-09-28
     * @param       adminUser
     * @return      void
     **/
    void modify(@NonNull AdminUser adminUser);

    /**
     * @Description 删除管理用户
     * @Author      ratel
     * @Date        2020-09-28
     * @param       id
     * @return      void
     **/
    void del(@NonNull String id);

    /**
     * @Description 分页查询
     * @Author      ratel
     * @Date        2020-09-28
     * @param       page
     * @return      com.baomidou.mybatisplus.core.metadata.IPage<com.ratel.mall.admin.pojo.po.AdminUser>
     **/
    IPage<AdminUser> page(@NonNull PageDTO<AdminUser> page);
}

