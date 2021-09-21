package counter;

public class PageCounter implements Counter{

    private int MAX_LINE_PAGE = 50;

    @Override
    public Integer count(String doc) {
        Counter lineCounter = CounterFactory.create(CounterFactory.LINE);
        Integer line = lineCounter.count(doc);
        return (Integer) Math.ceil((double)line / MAX_LINE_PAGE);
    }
}
