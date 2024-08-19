package com.damaomao.mallbackend.service;

import com.damaomao.mallbackend.dto.GoodsInfoDto;
import com.damaomao.mallbackend.dto.ProductIndexDto;
import com.damaomao.mallbackend.pojo.ResultVo;

public interface ProductIndexService {
    ResultVo queryProductIndexByType(ProductIndexDto productIndexDto);
}
