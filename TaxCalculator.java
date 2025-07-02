public class TaxCalculator {
    private static final double BASIC_TAX_RATE = 0.10;
    private static final double IMPORT_DUTY = 0.05;

    public double calculateTax(Product product) {
        double tax = 0.0;
        if (!product.isExempt()) {
            tax += product.getPrice() * BASIC_TAX_RATE;
        }
        if (product.isImported()) {
            tax += product.getPrice() * IMPORT_DUTY;
        }
        return roundUpToNearestFiveCents(tax);
    }

    private double roundUpToNearestFiveCents(double amount) {
        return Math.ceil(amount * 20.0) / 20.0;
    }
}
