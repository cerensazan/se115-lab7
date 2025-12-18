import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products do you have? ");
        int size = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter stock: ");
            int stock = sc.nextInt();

            products[i] = new Product(name, stock);
        }
        while (true) {
            System.out.print("Enter product to buy (Q to quit): ");
            String selected = sc.nextLine();

            if (selected == "Q" || selected == "q") {
                break;
            }

            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (products[i].getName() == selected) {
                    products[i].buyOne();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No such product!");
            }
        }

        System.out.println("\nProducts left:");
        for (int i = 0; i < size; i++) {
            products[i].printInfo();
        }

    }
}
