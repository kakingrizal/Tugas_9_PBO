
import java.util.ArrayDeque;

public class ArrayD {
    public static void main(String[] args) {
        ArrayDeque<String> myDeque = new ArrayDeque<>();
        myDeque.add("Rizal");
        myDeque.addFirst("20210040153");
        myDeque.add("Fauzi");
        myDeque.addLast("21F");
        
        for(String i : myDeque){
            System.out.println(i);
        }
    }
}
