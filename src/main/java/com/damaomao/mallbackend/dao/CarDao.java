package com.damaomao.mallbackend.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.damaomao.mallbackend.pojo.Car;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CarDao extends BaseMapper<Car> {
}
