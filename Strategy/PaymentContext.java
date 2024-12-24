/*
The context class is responsible for maintaining a reference to one of the strategy objects (e.g., PaymentStrategy in the example).
This allows the context to delegate specific behavior (like payment processing) to the strategy object it currently holds

Analogy:
    Think of the context as the manager:-
        - The manager (PaymentContext) knows which worker (PaymentStrategy) is responsible for a task (e.g., CreditCardPayment, PayPalPayment).
        - The manager assigns tasks to the appropriate worker and ensures the work is done, but the manager doesn't handle the details of how the work is done.
 */

package Strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy dynamically (The client explicitly decides the strategy and creates it)
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

