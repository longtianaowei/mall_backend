package com.damaomao.mallbackend.service;

import com.damaomao.mallbackend.dto.GoodsInfoDto;
import com.damaomao.mallbackend.pojo.ResultVo;

public interface GoodsInfoService {
    /**
     * 商品分类查询
     * */
    ResultVo queryGoodsInfoByType(GoodsInfoDto goodsInfoDto);
}
