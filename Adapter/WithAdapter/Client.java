// SOLID principles 'D' involved i.e Dependency Inversion
// Eg: Phone Pe failure with Yes Bank (In March 2020, PhonePe experienced a 24-hour service outage after the Reserve Bank of India (RBI) imposed a moratorium on Yes Bank, PhonePe's exclusive UPI (unified payments interface) partner. The outage affected close to 20 crore users and halted United Payments Interface (UPI) transactions. PhonePe worked with the National Payments Corporation of India (NPCI) and ICICI Bank, its new UPI partner, to restore services. By Friday night, all services were up and running again, including merchant payment settlements, consumer wallet, credit, and debit card payments, and UPI services.)
// The adapter design pattern is a structural pattern that allows you to make incompatible classes/structure work together using an interface as a bridge (sort of API). It acts as a bridge between two different interfaces, enabling objects with incompatible interfaces to collaborate.
// Intent:
    // Allow objects with incompatible interfaces to collaborate.
    // Provide a flexible way to adapt existing objects to new interfaces.
    // Promote loose coupling between objects by isolating the specific functionality needed for adaptation.
// Benefits: Promotes Reusability, Reduces Coupling, Increases Flexibility
// Eg: Social Media Aggregator (Facebook, Google), Language translators (Google Translate, Microsoft Translator), Insurance Providers Integration (AutoProtect, TravelGuard)   nb


package Adapter.WithAdapter;

import org.example.Adapter.WithoutAdapter.PhonePe;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        int balance = phonePe.checkBalance();

        System.out.println("Balance: " + balance);
    }
}
