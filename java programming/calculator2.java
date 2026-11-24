import java.util.Scanner;
public class calculator2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr first number : ");
        int a = sc.nextInt();

        System.out.println("Enetr second number : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The addition of " + a + " and " + b + " is " + sum);

        int sub = a - b;
        System.out.println("The subtraction of " + a + " and " + b + " is " + sub);

        int mul = a * b;
        System.out.println("The multipplication of " + a + " and " + b + " is " + mul);

        float div = a / b;
        System.out.println("The division of " + a + " and " + b + " is " + div);
    }
}