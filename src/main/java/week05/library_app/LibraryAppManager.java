package week05.library_app;

public class LibraryAppManager {


    public static void main(String[] args) {

        LibraryApp app = new LibraryApp();

        Book book1=new Book("1984","George Orwell",1949);
        Book book2=new Book("Animal Farm","George Orwell",1945);
        Book book3=new Book("Inheritance Games","Jenifer Barnes",2020);
        Book book4=new Book("Tutunamayanlar","Oğuz Atay",1972);

        app.addBook(book1);
        app.addBook(book2);
        app.addBook(book3);
        app.addBook(book4);

        System.out.println(app.bookDB);

        System.out.println(app.searchBookByTitle("1984"));


    }
}
