package com.company;

public class CatalogItem {
    private int spCode;
    private float price;
    private String name;

    public CatalogItem(int spCode, float price, String name) {
        this.spCode = spCode;
        this.price = price;
        this.name = name;
    }

    public int getSpCode() {
        return spCode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "CatalogItem{" +
                "spCode=" + spCode +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
