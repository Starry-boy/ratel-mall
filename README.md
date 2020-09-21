# ratel-mall

## 前言

使用目前所掌握的技术搭建一套完整的电商系统

## 项目文档

- 文档地址：

## 项目介绍

## 项目演示

## 组织结构

```
ratel-mall
├── ratel-mall-common -- 工具类及通用代码
├── ratel-mall-security -- SpringSecurity封装公用模块
├── ratel-mall-admin -- 后台商城管理系统接口
├── ratel-mall-search -- 基于Elasticsearch的商品搜索系统
└── ratel-mall-portal -- 前台商城系统接口
```

## 技术选型

### 后端技术

|         技术         |       说明       |                    官网                    |
| :------------------: | :--------------: | :----------------------------------------: |
|      SpringBoot      |   容器+MVC框架   |   https://spring.io/projects/spring-boot   |
|    SpringSecurity    |  认证和授权框架  | https://spring.io/projects/spring-security |
|     MybatisPlus      |     ORM框架      |                                            |
| Hibernator-Validator |     验证框架     |                                            |
|   SpringData-Cache   |     缓存框架     |                                            |
|        Druid         |   数据库连接池   |                                            |
|         JWT          |   JWT登录支持    |                                            |
|        Lombok        | 简化对象封装工具 |                                            |
|     MapperStruct     | 简化对象转换工具 |                                            |
|       LogStash       |   日志收集工具   |                                            |
|      Swagger-UI      |   文档生产工具   |                                            |
|       RocketMQ       |     消息队列     |                                            |
|       MongoDB        |   NoSQL数据库    |                                            |
|        MySQL         |   关系型数据库   |                                            |
|        Redis         |    分布式缓存    |                                            |
|    ElasticSearch     |     搜索引擎     |                                            |
|         OSS          |     对象存储     |                                            |
|        MInIO         |     对象存储     |                                            |
|       Jenkins        |  自动化部署工具  |                                            |
|         GIt          |   项目管理工具   |                                            |



### 前端技术

## 架构图

### 系统架构

### 业务架构

- 商品模块
  - 商品管理
  - 商品分类管理
  - 商品类型管理
  - 品牌管理
- 订单模块
  - 订单管理
  - 订单设置
  - 退货申请处理
  - 退货原因设置
- 营销模块
  - 秒杀活动管理
  - 优惠价管理
  - 品牌推荐管理
  - 新品推荐管理
  - 人气推荐管理
  - 专题推荐管理
  - 首页广告管理

## 模块介绍

## 环境搭建

## 开发环境

## 搭建步骤

## 开发步骤

1. 搭建项目

2. 完善 POM

3. 完善 common 模块

4. 创建数据库 和 表

5. 配置 数据源

6. 配置 swagger

7. 配置 缓存

8. 配置 校验框架

   

商品分类表

- cms_*：内容管理模块相关表
- oms_*：订单管理模块相关表
- pms_*：商品模块相关表
- sms_*：营销模块相关表
- ums_*：会员模块相关表

