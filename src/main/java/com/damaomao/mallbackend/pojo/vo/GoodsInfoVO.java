package com.damaomao.mallbackend.pojo.vo;

import lombok.Data;

@Data
public class GoodsInfoVO {
    private Integer goodsId;        // 商品id
    private Double price;       // 价格
    private String brandName;       // 品牌名称
    private Integer sellerId;       // 卖家id
    private String title;       // 标题
    private String src;     // 图片地址
    private Integer stockNum;       // 库存数量
    private Integer proType; // 类型
}
