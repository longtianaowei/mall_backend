package com.damaomao.mallbackend.service;

import com.damaomao.mallbackend.pojo.OrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.damaomao.mallbackend.pojo.ResultVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author damaomao
 * @since 2024-08-22
 */
public interface IOrderInfoService extends IService<OrderInfo> {
    ResultVo addOrderInfo(OrderInfo orderInfo);
}
