package counter;

public class CounterFactory {

    public static final String PAGE = "Page";
    public static final String LINE = "Line";
    public static final String PAR = "Paragraph";
    public static final String WORD = "Word";
    public static final String CHAR = "Character";
    public static final String TOKEN = "Token";

    public static Counter create(String cName){
        if (cName == PAGE)
            return (Counter) new PageCounter();
        else if (cName == LINE)
            return (Counter) new LineCounter();
        else if (cName == PAR)
            return (Counter) new ParagraphCounter();
        else
            return (Counter) new WordCounter();
    }
}
