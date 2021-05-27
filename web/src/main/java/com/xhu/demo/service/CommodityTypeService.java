package com.xhu.demo.service;

import com.xhu.demo.bean.CommodityType;
import com.xhu.demo.mapper.CommodityTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityTypeService implements ICommodityTypeService {
    @Autowired
    CommodityTypeMapper commodityTypeMapper;

    @Override
    public Integer addCommodityType(CommodityType commodityType){
        return commodityTypeMapper.addCommodityType(commodityType);
    }

    @Override
    public Integer deleteCommodityTypeById(Integer id) {
        return commodityTypeMapper.deleteCommodityTypeById(id);
    }
}
