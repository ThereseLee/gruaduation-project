package com.xhu.demo.service;

import com.xhu.demo.bean.Customer;
import com.xhu.demo.mapper.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/2/24.
 */
@Service
public class UserLoginService implements ILoginService<Customer>{

    @Autowired
    UserLoginMapper userLoginMapper;

    @Override
    public Customer getUserLoginByAccount(String account,String password){

        Customer customer = userLoginMapper.getUserLoginByAccount(account, password);

        return customer;
    }

}
