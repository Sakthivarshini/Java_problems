import java.util.*;
import java.util.TreeSet;

public class SetSecondLargest {
    public static void main(String[] args){
        int[] arr={5,2,10,1,3,20,0};
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:arr) set.add(i);
            int largest=set.last();
            int secondLargest=set.lower(largest);
            System.out.println("Second largest element is: "+secondLargest);

        
           }
}
