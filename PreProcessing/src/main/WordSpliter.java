package main;

public class WordSpliter {
    String[] words;

    public WordSpliter(String doc) {
        ///
        this.words = doc.split(".|,| ");
    }
}
