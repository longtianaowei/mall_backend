package com.damaomao.mallbackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.damaomao.mallbackend.dao.ProductIndexDao;
import com.damaomao.mallbackend.dto.ProductIndexDto;
import com.damaomao.mallbackend.pojo.ProductIndex;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.service.ProductIndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@Service
public class ProductIndexServiceImpl implements ProductIndexService {
    @Resource
    private ProductIndexDao productIndexDao;
    @Override
    public ResultVo queryProductIndexByType(ProductIndexDto productIndexDto) {
            // 创建条件构造器
            QueryWrapper<ProductIndex> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("pro_type",productIndexDto.getProType());

            // 查询分页
            Page<ProductIndex> page = new Page<>(productIndexDto.getPageNo(),productIndexDto.getPageSize());

            // 获取查询结果
            Page<ProductIndex> infoPage = productIndexDao.selectPage(page,queryWrapper);
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
}
