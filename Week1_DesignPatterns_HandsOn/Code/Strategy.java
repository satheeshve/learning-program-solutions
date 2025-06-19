interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected!");
        } else {
            strategy.pay(amount);
        }
    }
}

public class Strategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("This is the output for 5_Strategy Pattern");

        // Use Credit Card Payment
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        // Use PayPal Payment
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(800);
    }
}
