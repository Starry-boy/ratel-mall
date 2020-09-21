package com.ratel.mall.product.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.product.pojo.po.PmsSkuStock;
import com.ratel.mall.product.mapper.PmsSkuStockMapper;
import com.ratel.mall.product.service.PmsSkuStockService;
@Service
public class PmsSkuStockServiceImpl extends ServiceImpl<PmsSkuStockMapper, PmsSkuStock> implements PmsSkuStockService{

}
