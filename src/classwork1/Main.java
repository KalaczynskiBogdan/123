package classwork1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        String name = book1.getNameOfBook();
        int countOfPages = book1.getCountOfPages();
        System.out.println("Name of the book: " + name + ", count of pages: " + countOfPages);
    }
}

class Book {
    private String nameOfBook = "Harry Potter and the philosopher's stone";
    private int countOfPages = 223;

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getCountOfPages() {
        return countOfPages;

    }
    void abc(){

    }
}
