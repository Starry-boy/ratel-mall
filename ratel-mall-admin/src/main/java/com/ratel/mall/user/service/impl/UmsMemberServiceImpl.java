package com.ratel.mall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.user.mapper.UmsMemberMapper;
import com.ratel.mall.user.pojo.po.UmsMember;
import com.ratel.mall.user.service.UmsMemberService;
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService{

}
