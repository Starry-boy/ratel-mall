package com.ratel.mall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.user.pojo.po.UmsMenu;
import com.ratel.mall.user.mapper.UmsMenuMapper;
import com.ratel.mall.user.service.UmsMenuService;
@Service
public class UmsMenuServiceImpl extends ServiceImpl<UmsMenuMapper, UmsMenu> implements UmsMenuService{

}
