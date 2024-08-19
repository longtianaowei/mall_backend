package com.damaomao.mallbackend.controller;

import com.damaomao.mallbackend.dto.GoodsInfoDto;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.service.GoodsInfoService;
import com.damaomao.mallbackend.service.ProductIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsInfoController {

    //注入GoodsInfoService实现类
    @Autowired
    GoodsInfoService goodsInfoService;

    @GetMapping("/query")
    public ResultVo queryGoodsInfoByType(GoodsInfoDto dto)
    {
        return goodsInfoService.queryGoodsInfoByType(dto);
    }

}