
import java.util.ArrayList;

public class Customer {
   private String userName;

    private String password;
    private ArrayList<Account> accounts=new ArrayList<>();

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }
    static int confirmUsernameAndPassword(ArrayList<Customer> c,String user, String pass) {
        for(int i=0;i<c.size();i++){
            if (c.get(i).userName.equals(user) && c.get(i).password.equals(pass))
                return i;
        }
        System.out.println("Invalid user name or password!");
        return -1;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
