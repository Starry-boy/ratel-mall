package com.ratel.mall.order.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.order.pojo.po.OmsCartItem;
import com.ratel.mall.order.mapper.OmsCartItemMapper;
import com.ratel.mall.order.service.OmsCartItemService;
@Service
public class OmsCartItemServiceImpl extends ServiceImpl<OmsCartItemMapper, OmsCartItem> implements OmsCartItemService{

}
