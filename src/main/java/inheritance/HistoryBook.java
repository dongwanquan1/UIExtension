package inheritance;

/**
 * @Author dwq
 * @Create 2021/5/9
 **/
public class HistoryBook extends Book {
    private String dynasty;

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    @Override
    public String trailer() {
        return "this is a book";
    }
}
