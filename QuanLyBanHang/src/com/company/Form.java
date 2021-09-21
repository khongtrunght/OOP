package com.company;

import java.util.Date;
import java.util.Map;

public abstract class Form {
    private Integer catalogId;
    private Integer customerId = null;
    private CustomerInfo customerInfo;
    private Date date;
    private Map<Integer, Integer> productMap;

    public Form(){};

    public Form(Integer catalogId, CustomerInfo customerInfo, Date date, Map productMap) {
        this.catalogId = catalogId;
        this.date = date;
        this.customerInfo = customerInfo;
        this.productMap = productMap;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public Date getDate() {
        return date;
    }

    public Map<Integer, Integer> getProductMap() {
        return productMap;
    }
}
