package com.jerry.gamemarket.service;

import com.jerry.gamemarket.dto.OrderDTO;

/**
 * author by 李兆杰
 * Date 2018/10/8
 */
public interface BuyerService {
    OrderDTO findOrderOne(String openId,String orderId);
    OrderDTO findOrderlist(String openId,String orderId);
    OrderDTO cancelOrderOne(String openId,String orderId);
}
