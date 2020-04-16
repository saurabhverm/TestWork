import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList = new ArrayList<Book>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book bobj)
    {
        bookList.add(bobj);
    }
    public boolean isEmpty()
    {
        if(bookList.isEmpty())
            return true;

        return false;
    }

    public ArrayList<Book> viewAllBooks()
    {
        return bookList;
    }

    public ArrayList<Book> viewListByAuthor(String author)
    {
        ArrayList<Book> lst = new ArrayList<Book>();
        for (Book book:bookList
             ) {
            if(book.getAuthor().equals(author))
                lst.add(book);
        }
        if(lst.isEmpty())
            System.out.println("The list is empty");
        return lst;
    }

    public int countNoOfBook(String bName)
    {
        int count = 0;
        for (Book book : bookList
                ) {
            if(book.getBookName().equals(bName))
                count++;

        }
        if(count==0)
        System.out.println("No book found with the name "+bName);
        return count;
    }
}
