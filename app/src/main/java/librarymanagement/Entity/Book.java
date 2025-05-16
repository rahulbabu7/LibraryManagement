package librarymanagement.Entity;

public class Book {
    private String book_title;
    private  String book_Author;
    private Boolean is_Available;


    public Book(String title, String author){
        this.book_title = title;
        this.book_Author = author;
        this.is_Available = true; // default all books are available
    }

    public  String getTitle(){
        return this.book_title;
    }

    public  String getAuthor(){
        return this.book_Author;
    }
    public  Boolean isAvailable(){
        return this.is_Available;
    }
    
    public void borrowBook() { is_Available = false; }
    public void returnBook() { is_Available = true; }



    @Override
    public String toString() {
        return this.book_title + " by " + this.book_Author + (this.is_Available ? " (Available)" : " (Borrowed)");
    }
}
