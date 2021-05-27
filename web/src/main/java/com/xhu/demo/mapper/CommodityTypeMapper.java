package com.xhu.demo.mapper;

import com.xhu.demo.bean.CommodityType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommodityTypeMapper {
    //新增商品类型
    @Insert("insert into commoditytype(id,type_name) values ({#id},#{typeName}")
    public Integer addCommodityType(CommodityType commodityType);

    //删除商品类型
    @Delete("delete commoditytype where id = #{id}")
    public  Integer deleteCommodityTypeById(@Param("id") Integer id);
}
