package com.ratel.mall.product.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.product.mapper.PmsBrandMapper;
import com.ratel.mall.product.pojo.po.PmsBrand;
import com.ratel.mall.product.service.PmsBrandService;
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements PmsBrandService{

}
