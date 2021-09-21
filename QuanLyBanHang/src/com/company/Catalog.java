package com.company;

import java.util.Map;

public class Catalog {
    private Map<Integer,CatalogItem> catalogItemMap;
    private int id;

    public Catalog(int id, Map<Integer, CatalogItem> catalogItemMap) {
        this.catalogItemMap = catalogItemMap;
        this.id = id;
    }

    public CatalogItem getCatalogItem(Integer spCode){
        return catalogItemMap.get(spCode);
    }
}
