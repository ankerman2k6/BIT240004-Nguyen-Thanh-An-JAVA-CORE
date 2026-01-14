public class Test<E>{
    public static <E> void printArray(E[] array){
        for(E element : array){
            System.out.print(element + " ");
        }
    }
}
   