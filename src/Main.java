
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();
        Admin admin = new Admin("admin", "1234");

     
        admin.addItem(inventory, new MenuItem(1, "Burger", 15));
        
        admin.addItem(inventory, new MenuItem(2, "Pizza", 20));
        
        admin.addItem(inventory, new MenuItem(3, "Coffee", 5));

        admin.addItem(inventory, new MenuItem(4, "Orange Juice", 7));
        
        admin.addItem(inventory, new MenuItem(5, "Mango Juice", 8));
        
        admin.addItem(inventory, new MenuItem(6, "Apple Juice", 6));

        
        System.out.println("Menu:");
        inventory.displayMenu();

        Order order = new Order();

        System.out.print("How many items do you want to order? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item id: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            boolean found = false;
            for (MenuItem item : inventory.getItems()) {
                if (item.getId() == id) {
                    order.addItem(item);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Item not found, try again.");
                i--; 
            }
        }

        order.printBill();

        SortUtils.sortByPrice(inventory.getItems());

        FileManager.saveMenu(inventory.getItems());

        sc.close();
    }
}
