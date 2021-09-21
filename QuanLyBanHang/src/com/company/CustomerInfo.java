package com.company;

import java.util.HashMap;
import java.util.Map;

public class CustomerInfo {
    private Map<String, String> properties;

    public CustomerInfo(Map properties) {
        if (properties == null){
            this.properties = new HashMap();
        }
        else {
            this.properties = new HashMap(properties);
        }
    }

    public String getProperty(String propertyName){
        return properties.get(propertyName);
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public boolean matches(CustomerInfo otherInfo){
        if (otherInfo.getProperty("name").equals(properties.get("name")) && otherInfo.getProperty("phone").equals(properties.get("phone"))){
            return true;
        }
        else {
            return false;
        }
    }
}
