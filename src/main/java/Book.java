public class Book {
    private int isbnno;
    private String bookName;
    private String author;

    public int getIsbnno() {
        return isbnno;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setIsbnno(int isbnno) {
        this.isbnno = isbnno;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
