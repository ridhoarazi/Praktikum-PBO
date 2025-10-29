package Sort;
import java.util.ArrayList;
import java.util.Collections;

public class ArrSort {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println("Sebelum Sorting : ");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("Setelah Before");
        System.out.println(arr);
    }
}
