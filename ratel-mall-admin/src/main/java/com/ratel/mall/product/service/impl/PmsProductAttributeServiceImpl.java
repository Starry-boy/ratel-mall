package com.ratel.mall.product.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.product.pojo.po.PmsProductAttribute;
import com.ratel.mall.product.mapper.PmsProductAttributeMapper;
import com.ratel.mall.product.service.PmsProductAttributeService;
@Service
public class PmsProductAttributeServiceImpl extends ServiceImpl<PmsProductAttributeMapper, PmsProductAttribute> implements PmsProductAttributeService{

}
