package com.ratel.mall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.user.pojo.po.UmsResource;
import com.ratel.mall.user.mapper.UmsResourceMapper;
import com.ratel.mall.user.service.UmsResourceService;
@Service
public class UmsResourceServiceImpl extends ServiceImpl<UmsResourceMapper, UmsResource> implements UmsResourceService{

}
