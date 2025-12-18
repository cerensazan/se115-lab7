public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("SE", 300);
        Book b2 = b1;

        b2.addPages(20);

        System.out.println("Information of b1:");
        b1.printBook();

        System.out.println("Information of b2:");
        b2.printBook();
        // Both b1 and b2 show the updated page number because
        // they both refer to the same object in memory.
        // Only one Book object is actually created.

        Book b3 = new Book("Math", 320);
        System.out.println("Information of b1:");
        b1.printBook();
        System.out.println("Information of b3:");
        b3.printBook();
        // b1 and b3 have the same field values, but they are different objects
        // in memory, so their references are different.
        // That is why printing the objects shows different values.


    }
}
