package com.damaomao.mallbackend.dto;

import com.damaomao.mallbackend.pojo.MyPage;
import lombok.Data;

@Data
public class GoodsInfoDto extends MyPage {
    // 商品ID
    private  Integer goodsId;
    // 商品类型
    private Integer proType;
    // 品牌ID
    private  Integer brandId;
    // 商品最低价格
    private Double minPrice;
    // 商品最高价格
    private Double maxPrice;
    // 价格排序
    private String priceSort;
}
