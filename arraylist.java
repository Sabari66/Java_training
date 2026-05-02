import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        System.out.println(arr);
        arr.set(1,10);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.contains(4));
        arr.sort(null);
        System.out.println(arr);

        
    }
}
    