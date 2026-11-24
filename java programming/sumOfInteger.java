import java.util.Scanner;
public class sumOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate sum from 1 to : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i; // sum = sum + i;
        }
       System.out.println("The sum of all integer numbers between 1 to " + num + " is : " + sum);
    sc.close();
    }
}
