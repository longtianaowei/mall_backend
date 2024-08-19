package com.damaomao.proudctbackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.damaomao.proudctbackend.dao.GoodsInfoDao;
import com.damaomao.proudctbackend.dto.GoodsInfoDto;
import com.damaomao.proudctbackend.pojo.GoodsInfo;
import com.damaomao.proudctbackend.pojo.ResultVo;
import com.damaomao.proudctbackend.service.GoodsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
        @Resource
        private GoodsInfoDao goodsInfoDao;

        @Override
        public ResultVo queryGoodsInfoByType(GoodsInfoDto goodsInfoDto) {
                // 创建条件构造器
                QueryWrapper<GoodsInfo> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("pro_type",goodsInfoDto.getProType());

                // 查询分页
                Page<GoodsInfo> page = new Page<>(goodsInfoDto.getPage(),goodsInfoDto.getPageSize());

             // 获取查询结果
                Page<GoodsInfo> infoPage = goodsInfoDao.selectPage(page,queryWrapper);
                if(infoPage.getRecords().size()>0) {
                        Map<String,Object> map = new HashMap<>();
                    // 当前页集合
                        map.put("list",infoPage.getRecords());
                        // 总页数
                        map.put("total",infoPage.getPages());
                       // 总记录数
                        map.put("total",infoPage.getTotal());
                        // 返回结果
                        return ResultVo.success(map);
                }
                return ResultVo.error("没有查询到数据");
        }
}

