package com.lgz.gmail.service.impl;

import com.lgz.gmail.bean.UserAddress;
import com.lgz.gmail.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl1 implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("version old1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        UserAddress address1 = new UserAddress(1, "江西省郑州巩义市宋陵大厦2F", "1", "安然", "150360313x", "Y");
        UserAddress address2 = new UserAddress(2, "北京市昌平区沙河镇沙阳路", "1", "情话", "1766666395x", "N");
        return Arrays.asList(address1,address2);
    }
}
