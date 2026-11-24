import java.util.Scanner;

public class Returns{
    public static void main(String[] args) {
        greet();

        int first = readnumber();
        int second = readnumber();

        int sum = first + second;
        System.out.println("The sum of " + first + " and " + second + " is " + sum);
    }

    public static int readnumber () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();

        return number;
    }

    public static void greet() {
        System.out.println("Hello, Welcome to the world of Java Programming");
    }

}