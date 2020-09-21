package com.ratel.mall.product.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.product.mapper.PmsProductCategoryMapper;
import com.ratel.mall.product.pojo.po.PmsProductCategory;
import com.ratel.mall.product.service.PmsProductCategoryService;
@Service
public class PmsProductCategoryServiceImpl extends ServiceImpl<PmsProductCategoryMapper, PmsProductCategory> implements PmsProductCategoryService{

}
