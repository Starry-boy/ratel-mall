package com.ratel.mall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.user.pojo.po.UmsAdmin;
import com.ratel.mall.user.mapper.UmsAdminMapper;
import com.ratel.mall.user.service.UmsAdminService;
@Service
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminMapper, UmsAdmin> implements UmsAdminService{

}
