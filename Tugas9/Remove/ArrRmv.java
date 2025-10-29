package Remove;
import java.util.ArrayList;

public class ArrRmv {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Andrew");
        arr.add("Bob");
        arr.add("Cella");
        arr.add("Deni");
        arr.add(null);
        arr.add("Emily");
        System.out.println(arr);
        
        arr.remove("Deni");
        System.out.println(arr);
        
        Object testing = arr.remove(4);
        System.out.println(testing);
        System.out.println(arr);
    }
}
