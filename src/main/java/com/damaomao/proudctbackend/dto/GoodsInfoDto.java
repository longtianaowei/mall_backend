package com.damaomao.proudctbackend.dto;

import com.damaomao.proudctbackend.pojo.MyPage;
import lombok.Data;

@Data
public class GoodsInfoDto extends MyPage {
    // 商品类型
    private Integer proType;
}
