import org.junit.Assert;
import org.junit.Test;


public class TestClass {

    @Test
    public void testAddBook()
    {
        Book obj = new Book();
        obj.setIsbnno(1);
        obj.setBookName("Jungle Book");
        obj.setAuthor("Rudyard Kipling");

        Library lib = new Library();
        lib.addBook(obj);
        Assert.assertEquals(lib.getBookList().get(0).getBookName(),"Jungle Book");

    }
}
