package GetElements;
import java.util.ArrayList;

public class ArrGetElm {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Andrew");
        arr.add("Bob");
        arr.add("Cella");
        arr.add("Deni");
        arr.add(null);
        arr.add("Emily");
        System.out.println(arr);
        
        String s = arr.get(1);
        System.out.println("Di index 1 itu : "+s);
    }
}
