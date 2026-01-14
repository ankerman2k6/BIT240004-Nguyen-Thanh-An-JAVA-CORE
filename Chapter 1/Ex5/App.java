import java.util.ArrayList;
import java.util.LinkedList;

public class App {
  
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        
        linkedList.addFirst(5);
        linkedList.addLast(40);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Danh sách sau khi chỉnh sửa: " + linkedList);
    }
}
