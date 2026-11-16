
import java.util.ArrayList;

public class SortUtils {

    public static void sortByPrice(ArrayList<MenuItem> items) {
        for (int i = 0; i < items.size(); i++) {
            for (int j = i + 1; j < items.size(); j++) {
                if (items.get(i).getPrice() > items.get(j).getPrice()) {
                    MenuItem temp = items.get(i);
                    items.set(i, items.get(j));
                    items.set(j, temp);
                }
            }
        }
    }
}
