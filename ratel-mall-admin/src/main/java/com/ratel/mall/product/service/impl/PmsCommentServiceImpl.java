package com.ratel.mall.product.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.product.pojo.po.PmsComment;
import com.ratel.mall.product.mapper.PmsCommentMapper;
import com.ratel.mall.product.service.PmsCommentService;
@Service
public class PmsCommentServiceImpl extends ServiceImpl<PmsCommentMapper, PmsComment> implements PmsCommentService{

}
