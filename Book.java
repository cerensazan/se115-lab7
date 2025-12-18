public class Book {
    String title;
    int pages;

    public Book(String t, int p) {
        title = t;
        pages = p;
    }

    public void addPages(int extra) {
        pages += extra;
    }

    public void printBook() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }
}

