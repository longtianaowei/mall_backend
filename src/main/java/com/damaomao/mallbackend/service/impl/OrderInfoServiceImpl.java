package com.damaomao.mallbackend.service.impl;

import com.damaomao.mallbackend.pojo.Car;
import com.damaomao.mallbackend.pojo.OrderInfo;
import com.damaomao.mallbackend.dao.OrderInfoMapper;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.service.CarService;
import com.damaomao.mallbackend.service.IOrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author damaomao
 * @since 2024-08-22
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {
    @Resource
    OrderInfoMapper orderInfoMapper;

    @Autowired
    CarService carService;

    @Transactional
    @Override
    public ResultVo addOrderInfo(OrderInfo orderInfo) {
        if (orderInfoMapper.insert(orderInfo) > 0) {
            //批量更改购物车的订单id
            List<Car> list = new ArrayList<>();
            for(Integer id : orderInfo.getList()){
                Car c = new Car();
                c.setId(id);
                //修改订单id
                c.setOrderId(orderInfo.getOrderId());
                list.add(c);
            }
            //批量修改
            boolean is = carService.updateBatchById(list);
            if(is){
                return ResultVo.success("新增订单成功");
            }
        }
        return ResultVo.error("新增订单失败");
    }
}
