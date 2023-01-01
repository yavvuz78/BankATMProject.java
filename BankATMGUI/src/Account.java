
import javax.swing.*;
import java.util.ArrayList;

public class Account extends Customer {
    private String acNumber;
    private int balance;

    public Account(String userName,String password,String acNumber, int balance) {
        super(userName,password);
        this.acNumber = acNumber;
        this.balance = balance;
    }

    public String getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(String acNumber) {
        this.acNumber = acNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    static String printAccount(Customer c,String selectAccount) {
        String accounts ="";
        for (int i = 0; i < c.getAccounts().size(); i++) {
            accounts+="\nYou have a balance of "+ c.getAccounts().get(i).balance +
                    " in your numbered account "+ c.getAccounts().get(i).acNumber+"\n";
        }
       return accounts;
    }
    static int confirmAccountNumber(Customer c,String selectAccount) {
        for (int i = 0; i < c.getAccounts().size(); i++) {
            if (c.getAccounts().get(i).acNumber.equals(selectAccount)) {
                return i;}
            }
            return -1;
        }

}
