import java.util.Scanner;
public class calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number for subtraction : ");
        int c = sc.nextInt();
        System.out.println("Enter fourth number for subtraction : ");
        int d = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is : " + sum);
        int sub = c - d;
        System.out.println("The difference is : " + sub);
    } 
}
