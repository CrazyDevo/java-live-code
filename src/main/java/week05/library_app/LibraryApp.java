package week05.library_app;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {

    List<Book> bookDB;

    public LibraryApp() {
        bookDB = new ArrayList<>();
    }

    public Book searchBookByTitle(String title) {

        Book result = null;
        for (Book currentBook : bookDB) {

            if (currentBook.title.equalsIgnoreCase(title)){
                result= currentBook;
            }

        }

        if (result==null){
            throw  new RuntimeException("Book not found");
        }


        return result;
    }

    public List<Book> searchBookByAuthor(String authorName) {

       List<Book> result=new ArrayList<>();
        for (Book currentBook : bookDB) {

            if (currentBook.author.equalsIgnoreCase(authorName)){
                result.add(currentBook);
            }


        }
        return result;
    }


    public void addBook(Book book) {
        bookDB.add(book);
    }

    public void removeBook(Book book) {
        bookDB.remove(book);
    }




}
