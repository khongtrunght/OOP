package main;

import counter.Counter;
import io.Importer.PreImporter;
import io.exporter.IPreExporter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PreProcess {
    private String doc;
    private List<Counter> counters;
    private HashMap<String, Integer> info;

    public PreProcess(PreImporter importer, List<Counter> counters) {
        this.doc = importer.fetchDoc();
        this.counters = counters;
    }

    public void start() {
        this.info = new HashMap();
        Iterator var1 = this.counters.iterator();

        while(var1.hasNext()) {
            Counter counter = (Counter)var1.next();
            this.info.put(counter.getClass().getSimpleName(), counter.count(this.doc));
        }

    }

    public void export(IPreExporter exporter) {
        exporter.print(this.info);
    }
}