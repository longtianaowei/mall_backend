package com.damaomao.proudctbackend.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.damaomao.proudctbackend.pojo.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper     // 1、表示这是一个数据层。2、创建这个接口的实现类创建好
public interface GoodsInfoDao extends BaseMapper<GoodsInfo> {

}
