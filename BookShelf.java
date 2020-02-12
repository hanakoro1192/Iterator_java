public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;
    public BookShelf(int macsize){
        this.books = books;
    }

    public Book getBook(int index){
        return books[index];
    }
}