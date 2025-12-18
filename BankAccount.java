import java.util.Scanner;

public class BankAccount {
    private String accountID;
    private double balance;

    public BankAccount(String accountID,double balance){
        this.balance=balance;
        this.accountID=accountID;
    }
    public void setAccountID(String accountID) { accountID=this.accountID; }
    public void setBalance(double balance) { balance=this.balance; }
    public double getBalance() { return balance; }
    public String getAccountID() { return accountID; }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println(amount + "deposited");
        }else{
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount){
        if(amount<= balance){
            balance -= amount;
            System.out.println(amount+"withdraw");
        }else{
            System.out.println("Not enough balance. Would you like to go into debt? yes/no");

            Scanner sc = new Scanner(System.in);
            String answer = sc.next();

            switch (answer){
                case "yes":
                    balance-=amount;
                    System.out.println("You are now in debt.New balance:"+balance);
                    break;
                case "no":
                    System.out.println("Insufficient balance");
                    break;
                default:
                    System.out.println("Invalid answer");
                    break;

            }

        }

    }
    public void accountDetails(){
        System.out.println("Account ID :"+accountID);
        System.out.println("Balance:"+balance);
    }

}
