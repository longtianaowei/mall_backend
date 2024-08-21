package com.damaomao.mallbackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.damaomao.mallbackend.dao.GoodsInfoDao;
import com.damaomao.mallbackend.dto.GoodsInfoDto;
import com.damaomao.mallbackend.pojo.GoodsInfo;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.pojo.vo.GoodsInfoVO;
import com.damaomao.mallbackend.service.GoodsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
        @Resource
        private GoodsInfoDao goodsInfoDao;

        @Override
        public ResultVo queryGoodsInfoByType(GoodsInfoDto goodsInfoDto) {
                // 创建条件构造器
                QueryWrapper<GoodsInfo> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("pro_type",goodsInfoDto.getProType());
                // 判断是否需要添加品牌作为条件查询
                boolean isBrand = goodsInfoDto.getBrandId()!=0 && goodsInfoDto.getBrandId() != null;
                // 品牌查询
                queryWrapper.eq(isBrand,"brand_id",goodsInfoDto.getBrandId());
                // 价格区间查询
                boolean isPrice = goodsInfoDto.getMinPrice()!=0 && goodsInfoDto.getMinPrice()!=null;
                queryWrapper.between(isPrice,"price",goodsInfoDto.getMinPrice(),goodsInfoDto.getMaxPrice());

                // 价格升序
                if(Objects.equals(goodsInfoDto.getPriceSort(), "asc")) {
                        queryWrapper.orderByAsc("price");
                }
                // 价格降序
                if(Objects.equals(goodsInfoDto.getPriceSort(), "desc")) {
                        queryWrapper.orderByDesc("price");
                }
                // 查询分页
                Page<GoodsInfo> page = new Page<>(goodsInfoDto.getPageNo(),goodsInfoDto.getPageSize());

             // 获取查询结果
                Page<GoodsInfo> infoPage = goodsInfoDao.selectPage(page,queryWrapper);
                if(infoPage.getRecords().size()>0) {
                        Map<String,Object> map = new HashMap<>();
                    // 当前页集合
                        map.put("list",infoPage.getRecords());
                        // 总页数
                        map.put("pages",infoPage.getPages());
                       // 总记录数
                        map.put("total",infoPage.getTotal());
                        // 返回结果
                        return ResultVo.success(map);
                }
                return ResultVo.error("没有查询到数据");
        }

        @Override
        public ResultVo queryGoodsInfoDetailByGoodsId(Integer goodsId) {
                // 查询商品详情
                GoodsInfoVO goodsInfoVO = goodsInfoDao.queryByGoodsId(goodsId);
                if(goodsInfoVO != null) {
                        return ResultVo.success(goodsInfoVO);
                }
                return ResultVo.error();
        }
}

