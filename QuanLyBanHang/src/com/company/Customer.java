package com.company;

public class Customer {
    private static int nums = 0;
    private CustomerInfo customerInfo;
    private Integer id;
    public Customer(CustomerInfo customerInfo){
        this.customerInfo = customerInfo;
        this.id = ++nums;
    }

    public Integer getId() {
        return id;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void updateInfo(CustomerInfo customerInfo){

    }
}
