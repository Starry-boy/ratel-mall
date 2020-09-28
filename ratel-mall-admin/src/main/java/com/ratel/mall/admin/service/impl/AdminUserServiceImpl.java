package com.ratel.mall.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.admin.mapper.AdminUserMapper;
import com.ratel.mall.admin.pojo.po.AdminUser;
import com.ratel.mall.admin.pojo.vo.AdminUserVO;
import com.ratel.mall.admin.service.AdminUserService;
import com.ratel.mall.api.PageDTO;
import org.springframework.stereotype.Service;

/**
 * @author ratel
 * @date 2020-09-28
 */
@Service
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper, AdminUser> implements AdminUserService {

    @Override
    public void add(AdminUser adminUser) {
        adminUser.setId(null);
        super.saveOrUpdate(adminUser);
    }

    @Override
    public void modify(AdminUser adminUser) {
        super.saveOrUpdate(adminUser);

    }

    @Override
    public void del(String id) {
        super.removeById(id);
    }

    @Override
    public IPage<AdminUser> page(PageDTO<AdminUser> page) {
        return super.page(page, new QueryWrapper<AdminUser>(page.getPo()));
    }
}

