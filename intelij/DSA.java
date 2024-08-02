import java.util.*;
import java.util.ArrayList;

public class DSA {
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> col = new AarrayList<>();

        ArrayList<Integer> arr2 = new ArrayList<>();

        arr.add(1);
        arr.add(10);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        arr2.add(10);
        arr2.add(20);
        arr2.add(30);
        arr2.add(40);

        arr.addAll(arr2);
        arr.removeIf();
        System.out.println(arr);
    }
}
