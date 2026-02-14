import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String expr= scanner.nextLine();

        char[] operators = {'+', '-', '*', '/'};
        for (char operator: operators){
            int i = expr.indexOf(operator);
            if(i!=-1){
                try{
                    int num1 = Integer.parseInt(expr.substring(0,i));
                    int num2 = Integer.parseInt(expr.substring(i + 1));
                    int result= 0;
                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/': 
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                System.out.println("Cannot divide by zero");
                                continue;
                            }
                            break;
                    }
                System.out.println("Result: " + result);
                } catch(Exception e){
                    System.out.println("Invalid expression") ;
                }
            }
        }
    }
}
