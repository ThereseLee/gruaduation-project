package com.xhu.demo.service;

import com.xhu.demo.bean.Customer;
import com.xhu.demo.mapper.UserRegistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/3/18.
 */
@Service
public class UserRegistService {

    @Autowired
    UserRegistMapper userRegistMapper;

    public boolean userRegist(Customer customer){

        Integer regist = userRegistMapper.userRegist(customer);
        if(regist > 0 ){
            return true;
        }
        return false;
    }
}
