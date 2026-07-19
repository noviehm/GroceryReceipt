public class GroceryReceipt {
  public static void main(String[] args) {
        
        // Array that stores the grocery item names
        String[] items = {"Bread", "Milk", "Eggs", "Rice", "Juice", "Tomato", "Cereal", "Candies"};

        // Array that stores the corresponding prices
        double[] prices = {43, 89, 178, 250, 65, 35, 119, 132};

        // Variable to store the subtotal of all items
        double total = 0;

        // Display the store header
        System.out.println("****************************************");
        System.out.println("~~~~~~~~NOVIEHM'S MINI MARKET 🛒~~~~~~~~");
        System.out.println("****************************************");
        System.out.println(" Date: July 2026");
        System.out.println("----------------------------------------");
        System.out.println(" ITEM                 PRICE");
        System.out.println("----------------------------------------");



        // Loop through the arrays to display items and prices
        for (int i = 0; i < items.length; i++) {


            // Display each grocery item and its price
            System.out.println(items[i] + "\t\t\t\t PHP " + prices[i]);


            // Add each item's price to the subtotal
            total += prices[i];

        }


        // Compute the VAT (12%)
        double vat = total * 0.12;


        // Compute the grand total including VAT
        double grandTotal = total + vat;


        // Display receipt summary
        System.out.println("----------------------------------------");
        System.out.println(" Subtotal:      PHP " + total);
        System.out.println(" VAT (12%):     PHP " + vat);
        System.out.println(" Grand Total:   PHP " + grandTotal);
        System.out.println("----------------------------------------");



        // Display cashier and receipt information

        System.out.println(" Cashier: Minimart Assistant");
        System.out.println(" Receipt No.: 07/19/26");
        System.out.println("----------------------------------------");


        // Display thank-you message

        System.out.println("   Thank you for shopping with us! ❤️");
        System.out.println("      Have a wonderful day ahead!");
        System.out.println("****************************************");

    }
}

