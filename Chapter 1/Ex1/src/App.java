public class App {
    public static void main(String[] args)  {
        Test<Integer> integer = new Test<>();
        integer.setT(10);
        System.out.println("Giá trị số: "+integer.getT());

        Test<String> string = new Test<>();
        string.setT("Thành An");
        System.out.println("Giá trị chuỗi: "+ string.getT());
        
       
    }
}
