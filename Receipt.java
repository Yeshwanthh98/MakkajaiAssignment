// Receipt.java
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<ReceiptItem> items = new ArrayList<>();

    public void addItem(ReceiptItem item) {
        items.add(item);
    }

    public void printReceipt() {
        double totalTaxes = 0.0;
        double totalAmount = 0.0;

        for (ReceiptItem item : items) {
            System.out.println(item);
            totalTaxes += item.getSalesTax();
            totalAmount += item.getTotalPrice();
        }

        System.out.println("Sales Taxes: " + String.format("%.2f", totalTaxes));
        System.out.println("Total: " + String.format("%.2f", totalAmount));
    }
}
