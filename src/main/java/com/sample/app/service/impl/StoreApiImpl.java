/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.app.service.impl;

import com.sample.app.dto.OrderDTO;
import com.sample.app.service.StoreApi;
import java.util.Map;
import javax.ejb.Stateless;

/**
 *
 * @author kawabata
 */
@Stateless
public class StoreApiImpl implements StoreApi {

    @Override
    public void deleteOrder(Long orderId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, Integer> getInventory() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderDTO getOrderById(Long orderId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderDTO placeOrder(OrderDTO body) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
