package io.Importer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DictImporter {
    private static String dict = "Kỳ/k\nTuấn/toan";

    public List<String> getDict() {
        return Arrays.asList(dict.split("\n"));
    }
}
