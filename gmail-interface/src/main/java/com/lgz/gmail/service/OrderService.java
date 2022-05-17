package com.lgz.gmail.service;

import com.lgz.gmail.bean.UserAddress;

import java.util.List;

public interface OrderService {
    /**
     * 初始化订单
     *
     * @param userID
     * @return
     */
    public List<UserAddress> initOrder(String userID);
}