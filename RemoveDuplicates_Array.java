import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1, -2, 2, 3, 1, 4, 5, -3, 6};
        Set<Integer> s = new HashSet<>();
        for (int num: arr){
            s.add(Math.abs(num));
        
        }
        System.out.println("Array after removing the duplicates: " + s);
    }
}
