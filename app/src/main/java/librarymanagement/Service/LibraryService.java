package librarymanagement.Service;

import librarymanagement.Entity.Book;
import java.util.ArrayList;
import java.util.List;


public class LibraryService {
    List<Book> books = new ArrayList<>();

    //add book

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book has been added successfully "+book.getTitle());

    }

    public Book searchBook(String title){
        for (Book book:books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
            
        }   
    return null;
}

public void BorrowBook(String title){
    Book book = searchBook(title); //searching the book and if found return the book and storing in the book variable 
    if (book !=null && book.isAvailable()){
        book.borrowBook();
        System.out.println("You borrowed the book "+book.getTitle());

    }
    else{
        System.out.println("Book not available to borrow");
    }
}


public void ReturnBook(String title){
    Book book = searchBook(title);
        if (book != null && ! book.isAvailable()) {
            book.returnBook();
            System.out.println("🔁 Book returned: " + book.getTitle());
}else{
        System.out.println("Book not available to return");
    }

}

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("📂 Library is empty.");
            return;
        }
        for (Book book : books) {
            System.out.println(" - " + book);
        }
    }


}
