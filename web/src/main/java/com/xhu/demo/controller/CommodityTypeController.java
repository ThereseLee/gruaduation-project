package com.xhu.demo.controller;

import com.xhu.demo.bean.CommodityType;
import com.xhu.demo.mapper.CommodityTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CommodityTypeController {
    @Autowired
    CommodityTypeMapper commodityTypeMapper;

    @RequestMapping(value = "/manageType/addCommodityType")
    public String  addCommodityType(CommodityType commodityType){
        commodityTypeMapper.addCommodityType(commodityType);
        return "redirect:/admin/manageruser/manageType";
    }
    @RequestMapping(value = "/manageType/del/{id}")
    public String  deleteCommodityTypeById(Integer id){
        commodityTypeMapper.deleteCommodityTypeById(id);
        return "redirect:/admin/manageruser/manageType";
    }
}
