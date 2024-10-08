package com.damaomao.mallbackend.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.damaomao.mallbackend.pojo.GoodsInfo;
import com.damaomao.mallbackend.pojo.vo.GoodsInfoVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper     // 1、表示这是一个数据层。2、创建这个接口的实现类创建好
public interface GoodsInfoDao extends BaseMapper<GoodsInfo> {
    GoodsInfoVO queryByGoodsId(Integer goodsId);

}
