import java.util.Scanner;

class User_BankAccount {
    public double balance = 0;

}

class ATM extends User_BankAccount {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;

    public void menu() {
        while (flag) {
            System.out.println("\n1.Withdraw Money");
            System.out.println("2.Deposite Money");
            System.out.println("3.CheckBalance");
            System.out.println("4.Exit");

            System.out.print("Please Enter the Choice = ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Withdraw();
                    break;
                case 2:
                    Deposit();
                    break;
                case 3:
                    CheckBalance();
                    break;
                default:
                    System.out.println("Thank You!!");
                    flag = false;
                    break;
            }
        }
    }

    public void Withdraw() {
        System.out.print("Please enter the Withdraw amount:: ");
        double withdraw_amt = sc.nextInt();

        if (balance < withdraw_amt) {
            System.out.println("Sorry! Withdarwal is not possible Current balance is not Sufficient");
        } else {
            balance -= withdraw_amt;
            System.out.println("Withdraw is Successful");
        }

    }

    private void Deposit() {
        System.out.print("Please enter the Deposit amount :: ");
        double deposit_amt = sc.nextInt();
        balance += deposit_amt;
    }

    private void CheckBalance() {
        System.out.print("Your current balance is = " + balance);
    }

}

public class ATM_Application {
    public static void main(String[] args) {
        ATM at = new ATM();
        at.menu();

    }
}
