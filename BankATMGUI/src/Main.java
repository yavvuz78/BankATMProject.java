import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Customer mus1 = new Customer("User1", "psw1");
        mus1.getAccounts().add(new Account("User1", "psw1", "1001", 500));
        mus1.getAccounts().add(new Account("User1", "psw1", "1002", 300));

        Customer mus2 = new Customer("User2", "psw2");
        mus2.getAccounts().add(new Account("User2", "psw2", "2001", 100));
        mus2.getAccounts().add(new Account("User2", "psw2", "2002", 300));


        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(mus1);
        customers.add(mus2);


        String select;
        int selectAccountNumber;
        int inx;
       String selectAccount="";

        do {
           String userName=JOptionPane.showInputDialog("Enter your username...");
            Scanner s=new Scanner(userName);
            String userPassword =JOptionPane.showInputDialog("Enter your password...");
            new Scanner(userPassword);
             inx=(Customer.confirmUsernameAndPassword(customers,userName, userPassword));
        } while (inx == -1);

        Customer curreentCustomer=customers.get(inx);

        while (true) {
            Action a=new Action();
           select= JOptionPane.showInputDialog("Access to the system successful...\n\n"+"***BANK ATM MENU***\n\n"+
                   a.getActions().get(0)+"\n" +
                   a.getActions().get(1)+"\n"+
                   a.getActions().get(2)+"\n"+
                   a.getActions().get(3)
                   +"\n\nPlease Your Select Number! ");
           new Scanner(select);
            switch (select) {
                case "1":
                    String accountDeposit=Account.printAccount(curreentCustomer,selectAccount);
                    selectAccount=JOptionPane.showInputDialog(accountDeposit+"\n\nPlease Select Account");
                    new Scanner(selectAccount);
                    selectAccountNumber=Account.confirmAccountNumber(curreentCustomer,selectAccount);
                    if (selectAccountNumber == -1) break;
                    Bank.depositMoney(curreentCustomer, selectAccountNumber);
                    break;
                case "2":
                    String accountWithdraw=Account.printAccount(curreentCustomer,selectAccount);
                    selectAccount=JOptionPane.showInputDialog(accountWithdraw+"\n\nPlease Select Account");
                    new Scanner(selectAccount);
                    selectAccountNumber=Account.confirmAccountNumber(curreentCustomer, selectAccount);
                    if (selectAccountNumber == -1) break;
                    Bank.withDraw( curreentCustomer, selectAccountNumber);
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null,"This operation is currently not available!");
                    break;
                case "4":
                    System.exit(1);
                default:
                    JOptionPane.showMessageDialog(null,"You have logged in incorrectly...");
            }
        }
    }
}
