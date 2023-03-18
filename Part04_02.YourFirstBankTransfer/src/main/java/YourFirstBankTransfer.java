
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        Account cont = new Account("Matthews account", 1000.00);
        Account cont2 = new Account("My account", 0.0);
        
        cont.withdrawal(100.0);
        cont2.deposit(100.0);
        
        System.out.println(cont);
        System.out.println(cont2);
        // Do not touch the code in Account.java
        // write your program here
    }
}
