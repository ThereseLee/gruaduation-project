package com.xhu.demo.mapper;

import com.xhu.demo.bean.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2019/3/18.
 */
public interface AdminLoginMapper {

    //通过账号和密码从数据库获取是否有该用户信息
    @Select("select * from admin where account = #{account} and password = #{password}")
    public Admin getUserLoginByAccount(@Param("account") String account, @Param("password") String password);
}
