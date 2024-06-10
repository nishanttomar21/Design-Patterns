package Adapter;

public class PhonePe {
    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    double doSomething() {
        double currentBalance = bankAPI.getBalance("accountNumber");
        return currentBalance * 2;
    }
}