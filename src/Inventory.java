
import java.util.ArrayList;

public class Inventory {

    private ArrayList<MenuItem> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(int id) {
        for (MenuItem item : items) {
            if (item.getId() == id) {
                items.remove(item);
                break;
            }
        }
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void displayMenu() {
        for (MenuItem item : items) {
            item.printItem();
        }
    }
}
