import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int fact = 1;
        for (int i=0; i<num;i++){
            fact *= (i+1);

        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
