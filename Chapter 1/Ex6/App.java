import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class App {
  
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(9);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(8);
        hashSet.add(1);

        System.out.println("HashSet elements:" + hashSet);

        //Vì hashSet sẽ tự loại bỏ phần từ trùng lặp 
        //và  thứ tự sẽ được tự động sắp xếp tăng dần nên kết quả in ra sẽ khác với thứ tự thêm vào
    }
}
