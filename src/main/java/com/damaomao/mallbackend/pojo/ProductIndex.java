package com.damaomao.mallbackend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("product_index")
@Data
public class ProductIndex {
    // 默认主键自增
    @TableId(value = "pro_id", type = IdType.AUTO)
    private Integer proId;  // 商品id
    private String imgUrl;  // 图片地址
    private String imgDesc;  // 图片描述
    private Integer imgType;  // 图片类型
    private Integer proType;    // 商品类型
}