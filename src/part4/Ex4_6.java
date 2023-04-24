package part4;

public class Ex4_6 {
    public static void main(String[] args) {


        Account myAccount = new Account(10000);
        try {
            System.out.println(myAccount.withdraw(5000));
        } catch (OverdraftException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(myAccount.withdraw(10000));
        } catch (OverdraftException e) {
            e.printStackTrace();
        }

    }
}
