package com.damaomao.proudctbackend.pojo;

import lombok.Data;

@Data
public class MyPage {
    // 页码
    private Integer page;
    // 每页显示数量
    private  Integer pageSize;
}
