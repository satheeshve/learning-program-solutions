interface Discount {
    double apply(double amount);
}

class FestiveDiscount implements Discount {
    @Override
    public double apply(double amount) {
        return amount * 0.8; // 20% off
    }
}

class LoyaltyDiscount implements Discount {
    @Override
    public double apply(double amount) {
        return amount * 0.9; // 10% off
    }
}

public class OCP {
    public static void main(String[] args) {
        Discount d1 = new FestiveDiscount();
        Discount d2 = new LoyaltyDiscount();
        System.out.println("This is the output for 2_OpenClosed Principle (OCP)");
        System.out.println("Final Amount: " + d1.apply(1000));
        System.out.println("Final Amount: " + d2.apply(500));
    }
}
