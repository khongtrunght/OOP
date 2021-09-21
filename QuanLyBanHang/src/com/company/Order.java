package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Order {
    private List<OrderItem> orderList;
    private final Customer customer;
    private Catalog catalog;
    public Order(Customer customer, Catalog catalog) {
        this.customer = customer;
        orderList = new ArrayList<>();
    }

    public void putOrder(Map<Integer, Integer> productMap){
        for (Integer spCode : productMap.keySet()){
            CatalogItem cItem = catalog.getCatalogItem(spCode);
            orderList.add(new OrderItem(cItem, productMap.get(spCode)));
        }
    }
}
