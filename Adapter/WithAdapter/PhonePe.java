package Adapter.WithAdapter;

public class PhonePe {
    public int checkBalance() {
        // BankAPIAdapterFactory - Use Factory design pattern to get user input for bank selection and then use adapter to process the request forward
        //BankApiAdapter api = new YesBankApiAdapter(); // Pass the object according to the user input passed from factory method
        BankApiAdapter api = new IciciBankApiAdapter(); // Now, only 1 line of code change if the Yes Bank fails (Because of Runtime Polymorphism)

        int balance = api.getBalance();

        return balance;
    }

    // many more methods
}
