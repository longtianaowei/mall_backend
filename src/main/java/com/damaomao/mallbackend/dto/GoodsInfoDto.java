package com.damaomao.mallbackend.dto;

import com.damaomao.mallbackend.pojo.MyPage;
import lombok.Data;

@Data
public class GoodsInfoDto extends MyPage {
    // 商品类型
    private Integer proType;
}
