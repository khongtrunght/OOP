package counter;

public class ParagraphCounter implements Counter{
    @Override
    public Integer count(String doc) {
        String[] lines = doc.split("\n");
        return lines.length;
    }
}
