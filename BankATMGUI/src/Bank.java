import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public abstract class  Bank {
    private int selectAccountNumber;
    public Bank(int selectAccountNumber) {
        this.selectAccountNumber = selectAccountNumber;
    }
    public int getSelectAccountNumber() {
        return selectAccountNumber;
    }
    public void setSelectAccountNumber(int selectAccountNumber) {
        this.selectAccountNumber = selectAccountNumber;
    }
    static void depositMoney(Customer customers, int selectAccountNumber){
        Scanner scan;
        //JOptionPane.showInputDialog("Enter the deposit amount = ");
      int depositMoney=Integer.parseInt(JOptionPane.showInputDialog("Enter the deposit amount = "));
        new Scanner(String.valueOf(depositMoney));
        customers.getAccounts().get(selectAccountNumber).setBalance(customers.getAccounts().get(selectAccountNumber).getBalance()
                + depositMoney);
        JOptionPane.showMessageDialog(null,"The new amount in your account : "+ customers.getAccounts().get(selectAccountNumber).getBalance());
    }
    static void withDraw(Customer customers,int selectAccountNumber) {
        Scanner scan;
        //JOptionPane.showInputDialog("Enter the withdraw amount = ");
        int withdrawMoney=Integer.parseInt(JOptionPane.showInputDialog("Enter the deposit amount = "));
        new Scanner(String.valueOf(withdrawMoney));
        if (customers.getAccounts().get(selectAccountNumber).getBalance() >= withdrawMoney) {
            customers.getAccounts().get(selectAccountNumber).setBalance(customers.getAccounts().get(selectAccountNumber).getBalance()
                    - withdrawMoney);
            JOptionPane.showMessageDialog(null,"The new amount in your account : "+ customers.getAccounts().get(selectAccountNumber).getBalance());
        } else JOptionPane.showMessageDialog(null,"Your balance is insufficient..");
    }

}
