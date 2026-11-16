
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void saveMenu(ArrayList<MenuItem> items) {
        try {
            FileWriter writer = new FileWriter("menu.txt");

            for (MenuItem item : items) {
                writer.write(
                    item.getId() + "," +
                    item.getName() + "," +
                    item.getPrice() + "\n"
                );
            }

            writer.close();
            System.out.println("Menu saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving menu to file.");
        }
    }
}

