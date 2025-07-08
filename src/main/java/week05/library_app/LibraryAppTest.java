package week05.library_app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryAppTest {

    @Test
    public void test() {
        LibraryApp appDB = new LibraryApp();

        Book book=new Book("1984","George Orwell",1949);
       // I am tesitng my method
        appDB.addBook(book);
        Assert.assertTrue(appDB.bookDB.contains(book));
    }




}
