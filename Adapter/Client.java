// SOLID principles 'D' involved i.e Dependency Inversion
// Eg: Phone Pe failure with Yes Bank
// The adapter design pattern is a structural pattern that allows you to make incompatible interfaces work together. It acts as a bridge between two different interfaces, enabling objects with incompatible interfaces to collaborate.
// Intent:
    // Allow objects with incompatible interfaces to collaborate.
    // Provide a flexible way to adapt existing objects to new interfaces.
    // Promote loose coupling between objects by isolating the specific functionality needed for adaptation.
// Benefits: Promotes Reusability, Reduces Coupling, Increases Flexibility

package Adapter;

//import WithoutAdapter.PhonePe;

public class Client {
    public static void main(String[] args) {
        // userInputUPI
        // BankAPIAdapterFactory - Use factory design pattern get user input for bank selection and then use adapter to process the request forward
        BankAPIAdapter bankAPIAdapter = new ICICIBankAPIAdapter(); // Pass the object according to the user input passed from factory method
        PhonePe phonePe = new PhonePe(bankAPIAdapter);
    }
}
