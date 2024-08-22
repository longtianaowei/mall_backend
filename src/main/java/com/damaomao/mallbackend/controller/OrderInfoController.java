package com.damaomao.mallbackend.controller;


import com.damaomao.mallbackend.pojo.OrderInfo;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.service.IOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author damaomao
 * @since 2024-08-22
 */
@RestController
@RequestMapping("/order")
public class OrderInfoController {
    @Autowired
    IOrderInfoService orderInfoService;
    @RequestMapping("/add")
    public ResultVo addOrderInfo(OrderInfo orderInfo) {
        return orderInfoService.addOrderInfo(orderInfo);
    }
}

