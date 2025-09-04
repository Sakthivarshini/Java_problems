import java.util.*;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String1: ");
        String str1= scanner.nextLine();
        System.out.print("Enter the String2: ");
        String str2= scanner.nextLine();

        if(str1.length()!=str2.length()){
            System.out.println("Not anagram");
            return;
        }

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.print("Anagram");

        }
        else{
            System.out.print("Not Anagram");
        }
    }
}
    
