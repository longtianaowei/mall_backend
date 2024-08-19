package com.damaomao.proudctbackend.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("goods_info")
@Data
public class GoodsInfo {
    // 默认主键自增
    @TableId(value = "goods_id", type = IdType.AUTO)        // 主键
    private Integer goodsId;        // 商品id
    private Double price;       // 价格
    private Integer brandId;        // 品牌id
    private Integer sellerId;       // 卖家id
    private String title;       // 标题
    private String src;     // 图片地址
    private Integer proType;        // 商品类型
    private Integer stockNum;       // 库存数量
}
