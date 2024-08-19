package com.damaomao.proudctbackend.service;

import com.damaomao.proudctbackend.dto.GoodsInfoDto;
import com.damaomao.proudctbackend.pojo.ResultVo;

public interface GoodsInfoService {
    /**
     * 商品分类查询
     * */
    ResultVo queryGoodsInfoByType(GoodsInfoDto goodsInfoDto);
}
