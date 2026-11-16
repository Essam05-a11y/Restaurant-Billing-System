
import java.util.ArrayList;

public class Order {

    private ArrayList<MenuItem> orderItems;

    public Order() {
        orderItems = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        orderItems.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : orderItems) {
            total += item.getPrice();
        }
        return total;
    }

    public void printBill() {
        System.out.println("----- Bill -----");
        for (MenuItem item : orderItems) {
            item.printItem();
        }
        System.out.println("Total: " + calculateTotal() + " SR");
    }
}
