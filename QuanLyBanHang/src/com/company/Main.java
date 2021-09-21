package com.company;

import java.util.List;
import java.util.Map;

public class Main {

    public static Map<Integer, Catalog> catalogMap;

    public static void main(String[] args) {



    }


    public static void processForm(Form form, Map<Integer, Customer> map){
        Customer customer = null;
        if (form.getCustomerId() == null){
            boolean found = false;
            for (Customer c: map.values()){
                if (c.getCustomerInfo().matches(form.getCustomerInfo())){
                    customer = c;
                    found = true;
                }
                break;
            }
            if (! found){
                customer = new Customer(form.getCustomerInfo());
                map.put(customer.getId(), customer);
            }
        }
        else{
            customer = map.get(form.getCustomerId());
            customer.updateInfo(form.getCustomerInfo());
        }

        Order order = new Order(customer, catalogMap.get(form.getCatalogId()));
        order.putOrder(form.getProductMap());

    }
}
