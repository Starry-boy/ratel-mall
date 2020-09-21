package com.ratel.mall.order.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.order.mapper.OmsOrderSettingMapper;
import com.ratel.mall.order.pojo.po.OmsOrderSetting;
import com.ratel.mall.order.service.OmsOrderSettingService;
@Service
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingMapper, OmsOrderSetting> implements OmsOrderSettingService{

}
