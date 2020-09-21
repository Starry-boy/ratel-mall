package com.ratel.mall.order.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.order.mapper.OmsOrderMapper;
import com.ratel.mall.order.pojo.po.OmsOrder;
import com.ratel.mall.order.service.OmsOrderService;
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements OmsOrderService{

}
