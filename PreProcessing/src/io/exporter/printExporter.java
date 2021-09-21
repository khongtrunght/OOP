package io.exporter;

import java.util.HashMap;
import java.util.Iterator;

public class printExporter implements IPreExporter {
    public printExporter() {
    }

    public void print(HashMap<String, Integer> countHashMap) {
        Iterator var2 = countHashMap.keySet().iterator();

        while(var2.hasNext()) {
            String type = (String)var2.next();
            System.out.println(type + ": " + countHashMap.get(type));
        }

    }
}
