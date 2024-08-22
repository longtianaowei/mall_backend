package com.damaomao.mallbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.damaomao.mallbackend.pojo.Car;
import com.damaomao.mallbackend.pojo.ResultVo;

import java.util.List;

public interface CarService extends IService<Car> {
    // 添加购物车
    ResultVo addCar(Car car);


    // 通过用户id查询用户的购物车
    ResultVo queryCar(Integer userId);


    // 逻辑删除购物车
    ResultVo delCar(Integer id);

}
