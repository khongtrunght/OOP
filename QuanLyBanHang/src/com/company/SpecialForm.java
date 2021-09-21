package com.company;

import java.util.Date;
import java.util.Map;

public class SpecialForm extends Form {

    private Integer customerId;

    public SpecialForm(Integer customerId, Integer catalogId, CustomerInfo customerInfo, Date date, Map productMap) {
        super(catalogId, customerInfo, date, productMap);
        this.customerId = customerId;
    }

    @Override
    public Integer getCustomerId() {
        return customerId;
    }
}
