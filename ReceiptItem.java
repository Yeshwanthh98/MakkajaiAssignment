
public class ReceiptItem {
    private int quantity;
    private Product product;
    private double salesTax;
    private double totalPrice;

    public ReceiptItem(int quantity, Product product, TaxCalculator taxCalculator) {
        this.quantity = quantity;
        this.product = product;
        this.salesTax = taxCalculator.calculateTax(product) * quantity;
        this.totalPrice = (product.getPrice() + taxCalculator.calculateTax(product)) * quantity;
    }

    public double getSalesTax() { return salesTax; }
    public double getTotalPrice() { return totalPrice; }

    @Override
    public String toString() {
        return quantity + " " + product.getName() + ": " + String.format("%.2f", totalPrice);
    }
}
