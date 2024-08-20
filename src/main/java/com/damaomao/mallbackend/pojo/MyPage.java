package com.damaomao.mallbackend.pojo;

import lombok.Data;

@Data
public class MyPage {
    // 页码
    private Integer pageNo;
    // 每页显示数量
    private  Integer pageSize;
}
