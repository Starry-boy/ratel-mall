package com.ratel.mall.content.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ratel.mall.content.pojo.po.CmsTopic;
import com.ratel.mall.content.mapper.CmsTopicMapper;
import com.ratel.mall.content.service.CmsTopicService;
@Service
public class CmsTopicServiceImpl extends ServiceImpl<CmsTopicMapper, CmsTopic> implements CmsTopicService{

}
