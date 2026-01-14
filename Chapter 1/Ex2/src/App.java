public class App {
  
     public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Thành", "An", "CR7"};

        System.out.println("Mảng số:");
        Test.printArray(intArray);

        System.out.println("\nMảng chuỗi:");
        Test.printArray(strArray);
    }
}
