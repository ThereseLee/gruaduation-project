package com.xhu.demo.mapper;

import com.xhu.demo.bean.Customer;

/**
 * Created by Administrator on 2019/3/18.
 */
public interface UserRegistMapper {

    //处理用户注册请求
    public Integer userRegist(Customer customer);
}
