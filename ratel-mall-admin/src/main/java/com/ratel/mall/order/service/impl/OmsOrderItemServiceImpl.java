package com.ratel.mall.order.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.order.pojo.po.OmsOrderItem;
import com.ratel.mall.order.mapper.OmsOrderItemMapper;
import com.ratel.mall.order.service.OmsOrderItemService;
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements OmsOrderItemService{

}
