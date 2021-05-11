import inheritance.FictionBook;

public class HelloWorld {
    //    public static final //    psf
    private int ages;
    private String name;

    public void setAges(int ages) {
        this.ages = ages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public String getName() {
        return name;
    }

    /*
    create a new instance
    * */
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook();
        fictionBook.getHero();
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("hello world");
    }
}
