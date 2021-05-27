package com.xhu.demo.service;

import com.xhu.demo.bean.AnasislyResult;
import com.xhu.demo.mapper.AnasislyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/4/2.
 */
@Service
public class AnasislyService {

    @Autowired
    AnasislyMapper anasislyMapper;

    public List<AnasislyResult> getCommodityType(){

        List<AnasislyResult> commodityType = anasislyMapper.getCommodityType();

        return  commodityType;
    }
}
