package Adapter.WithoutAdapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        int balance = phonePe.checkBalance();

        System.out.println("Balance: " + balance);
    }
}
