public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println("Output 1:");
        Receipt receipt1 = new Receipt();
        receipt1.addItem(new ReceiptItem(1, new Product("book", 12.49, false, true), taxCalculator));
        receipt1.addItem(new ReceiptItem(1, new Product("music CD", 14.99, false, false), taxCalculator));
        receipt1.addItem(new ReceiptItem(1, new Product("chocolate bar", 0.85, false, true), taxCalculator));
        receipt1.printReceipt();
        System.out.println();

        System.out.println("Output 2:");
        Receipt receipt2 = new Receipt();
        receipt2.addItem(new ReceiptItem(1, new Product("imported box of chocolates", 10.00, true, true), taxCalculator));
        receipt2.addItem(new ReceiptItem(1, new Product("imported bottle of perfume", 47.50, true, false), taxCalculator));
        receipt2.printReceipt();
        System.out.println();

        System.out.println("Output 3:");
        Receipt receipt3 = new Receipt();
        receipt3.addItem(new ReceiptItem(1, new Product("imported bottle of perfume", 27.99, true, false), taxCalculator));
        receipt3.addItem(new ReceiptItem(1, new Product("bottle of perfume", 18.99, false, false), taxCalculator));
        receipt3.addItem(new ReceiptItem(1, new Product("packet of headache pills", 9.75, false, true), taxCalculator));
        receipt3.addItem(new ReceiptItem(1, new Product("box of imported chocolates", 11.25, true, true), taxCalculator));
        receipt3.printReceipt();
    }
}
