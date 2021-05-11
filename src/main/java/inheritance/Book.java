package inheritance;

/**
 * @Author dwq
 * @Create 2021/5/9
 **/
public class Book implements BookInterface {
    private int pages;
    private String bookName;
    private String author;
    private String illustrator;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    @Override
    public String trailer() {
        return "this is a book";
    }
}
