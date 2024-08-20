package com.damaomao.mallbackend.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.damaomao.mallbackend.pojo.BrandInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BrandDao extends BaseMapper<BrandInfo> {
}
