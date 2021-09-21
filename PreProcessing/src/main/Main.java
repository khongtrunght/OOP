package main;

import counter.Counter;
import counter.CounterFactory;
import io.Importer.KeyboardImporter;
import io.Importer.PreImporter;
import io.exporter.printExporter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PreImporter importer = new KeyboardImporter();
        List<Counter> counters = new ArrayList<>();
        counters.add(CounterFactory.create(CounterFactory.CHAR));
        counters.add(CounterFactory.create(CounterFactory.LINE));

        PreProcess pre = new PreProcess(importer, counters);
        pre.start();
        pre.export(new printExporter());
    }

    public static void printAfter(String doc){

    }
}
