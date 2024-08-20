package com.damaomao.mallbackend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("brand")
@Data
public class BrandInfo {
    // 默认主键自增
    @TableId(value = "brand_id", type = IdType.AUTO)
    private Integer brandId;        // 品牌id
    private String brandName;       // 品牌名称
    private Integer proType;        // 商品类型
}
