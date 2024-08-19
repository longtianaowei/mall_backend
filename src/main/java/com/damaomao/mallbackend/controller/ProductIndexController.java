package com.damaomao.mallbackend.controller;

import com.damaomao.mallbackend.dto.GoodsInfoDto;
import com.damaomao.mallbackend.dto.ProductIndexDto;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.service.GoodsInfoService;
import com.damaomao.mallbackend.service.ProductIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductIndexController {
    //注入ProductIndexService实现类
    @Autowired
    ProductIndexService productIndexService;

    @GetMapping("/query")
    public ResultVo queryProductIndexByType(ProductIndexDto dto)
    {
        return productIndexService.queryProductIndexByType(dto);
    }
}
