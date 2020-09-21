package com.ratel.mall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.user.pojo.po.UmsPermission;
import com.ratel.mall.user.mapper.UmsPermissionMapper;
import com.ratel.mall.user.service.UmsPermissionService;
@Service
public class UmsPermissionServiceImpl extends ServiceImpl<UmsPermissionMapper, UmsPermission> implements UmsPermissionService{

}
