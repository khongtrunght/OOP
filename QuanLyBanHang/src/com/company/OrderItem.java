package com.company;

public class OrderItem {
    private CatalogItem item;

    private int nums;

    public OrderItem(CatalogItem item, int nums) {
        this.item = item;
        this.nums = nums;
    }


    public int getNums() {
        return nums;
    }

    public float getPrice(){
        return item.getPrice() * nums;
    }

}
