package com.damaomao.mallbackend.controller;

import com.damaomao.mallbackend.dto.GoodsInfoDto;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    BrandService brandService;

    @GetMapping("query")
    public ResultVo queryBrand()
    {
        return brandService.queryBrand();
    }
}
