package SizeOfElements;
import java.util.ArrayList;

public class ArrSOE {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(arr);
        int b = arr.size();
        System.out.println("Sizenya : "+ b);
    }
}
