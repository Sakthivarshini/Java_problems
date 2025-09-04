import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        
        
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        
        
        Arrays.sort(arr);
        
        for(int i = arr.length-2; i >= 0; i--) {
            if(arr[i] != arr[arr.length-1]) {
                System.out.println("Second largest element is: " + arr[i]);
                break;
            }
        }
        scanner.close();
    }
}
