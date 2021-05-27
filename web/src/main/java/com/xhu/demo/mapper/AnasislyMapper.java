package com.xhu.demo.mapper;

import com.xhu.demo.bean.AnasislyResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnasislyMapper {

    @Select("select a.type,a.count,c.type_name from anasislytype a,commoditytype c where a.type = c.id")
    public List<AnasislyResult> getCommodityType();
}
