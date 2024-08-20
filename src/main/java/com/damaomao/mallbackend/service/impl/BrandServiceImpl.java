package com.damaomao.mallbackend.service.impl;

import com.damaomao.mallbackend.dao.BrandDao;
import com.damaomao.mallbackend.pojo.ResultVo;
import com.damaomao.mallbackend.service.BrandService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;
    @Override
    public ResultVo queryBrand() {

        return ResultVo.success(brandDao.selectList(null));
    }
}
