package com.damaomao.mallbackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damaomao.mallbackend.dao.CarDao;
import com.damaomao.mallbackend.pojo.Car;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class CarServiceImpl extends ServiceImpl<CarDao, Car> implements CarService {
    @Resource
    private CarDao carDao;

    @Override
    public ResultVo addCar(Car car) {
        if (carDao.insert(car) > 0) {
            return ResultVo.success();
        }
        return ResultVo.error();
    }

    @Override
    public ResultVo queryCar(Integer userId) {
        QueryWrapper<Car> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",userId);
        List<Car> list = carDao.selectList(queryWrapper);
        if(list.size()>0){
            return ResultVo.success(list);
        }
        return ResultVo.error("购物车暂无数据");
    }

    @Override
    public ResultVo delCar(Integer id) {
        if (carDao.deleteById(id) > 0) {
            return ResultVo.success();
        }
        return ResultVo.error();
    }
}
