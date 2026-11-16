
public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    public void addItem(Inventory inventory, MenuItem item) {
        inventory.addItem(item);
    }

    public void removeItem(Inventory inventory, int id) {
        inventory.removeItem(id);
    }
}

