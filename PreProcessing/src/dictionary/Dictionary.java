package dictionary;

import io.Importer.DictImporter;
import io.Importer.FileImporter;

import java.util.HashMap;
import java.util.List;

public class Dictionary {
    private List<String> dict;

    public Dictionary(DictImporter importer) {
        dict = importer.getDict();
    }

    public Boolean isVN(String s) {
        if (dict.contains(s)) {
            return true;
        } else
            return false;
    }
}
