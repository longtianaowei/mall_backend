package com.damaomao.mallbackend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("car")
@Data
public class Car {
    // 默认主键自增
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer goodsId;
    private String goodsName;
    private Integer num;
    private Double price;
    private String src;
    private Integer userId;
    private String orderId;
    @TableLogic
    private  Integer delete_tag;
}
