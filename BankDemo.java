import java.util.Scanner;

public class BankDemo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        BankAccount a1 = new BankAccount("1234",1200);
        BankAccount a2 = new BankAccount("4321",700);
        BankAccount current= a1;

        int option = 0;
        while (option !=4){
            System.out.println("1 → Deposit");
            System.out.println("2 → Withdraw");
            System.out.println("3 → Account Details");
            System.out.println("4 → Exit");

            option= sc.nextInt();
            switch (option){
                case 1:
                    System.out.print("Deposit amount: ");
                    double d = sc.nextDouble();
                    current.deposit(d);
                    break;
                case 2:
                    System.out.print("Withdraw amount: ");
                    double w = sc.nextDouble();
                    current.withdraw(w);
                    break;
                case 3:
                    current.accountDetails();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        }
        System.out.println("Old ID: " + a1.getAccountID());
        a1.setAccountID("9999");
        System.out.println("New ID: " + a1.getAccountID());

        System.out.println("Final Account Information:");
        a1.accountDetails();
        a2.accountDetails();
    }
}
