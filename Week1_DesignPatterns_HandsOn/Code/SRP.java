class Invoice {
    private final double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return amount;
    }
}

class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice Total: " + invoice.getTotal());
    }
}

public class SRP {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1500);
        InvoicePrinter printer = new InvoicePrinter();
        System.out.println("This is the output for 1_Single Responsibility Principle (SRP)");
        printer.printInvoice(invoice);
    }
}
