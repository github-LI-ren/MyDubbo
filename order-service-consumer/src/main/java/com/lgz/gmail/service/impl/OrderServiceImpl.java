package com.lgz.gmail.service.impl;

import com.lgz.gmail.bean.UserAddress;
import com.lgz.gmail.service.OrderService;
import com.lgz.gmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    public UserService userService;
    public List<UserAddress> initOrder(String userID) {
        //查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userID);
        for(UserAddress userAddress:userAddressList){
            System.out.println(userAddress);
        }
        return userAddressList;
    }
}