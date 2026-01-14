import java.util.HashMap;
import java.util.TreeMap;


public class App {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Laptop", 1500.0);
        treeMap.put("Mouse", 25.0);
        treeMap.put("Keyboard", 50.0);

        System.out.println("Danh sách Treemap sắp xếp theo khoá: " + treeMap);

        System.out.println("Danh sách Treemap trong khoảng khoá K đến M: " + treeMap.subMap("K", "M"));
    }
}
