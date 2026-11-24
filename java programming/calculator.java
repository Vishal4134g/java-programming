import java.util.Scanner;
public class calculator{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;
        int sub = num1- num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is : " + sum + " rs.");
        System.out.println("The Subtraction of " +num1 + "and " + num2 + " is : " + sub + " rs.");
        System.out.println("The Multiplication of " + num1 + " and " + num2 + " is : " + mul + " rs.");
        System.out.println("The Division of " + num1 + " and " + num2 + " is : " + div + " rs.");
        sc.close();
     }
}