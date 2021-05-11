package inheritance;

/**
 * @Author dwq
 * @Create 2021/5/9
 **/
public class FictionBook extends Book{
    private String hero;

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }
    @Override
    public String trailer() {
        return "this is a book";
    }

}
