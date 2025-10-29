package AddBeetw2;
import java.util.ArrayList;

public class ArrAddB2 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        
        arr.add(2, 3);
        System.out.println(arr);
    }
}
