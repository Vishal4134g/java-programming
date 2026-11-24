import java.util.Scanner;

public class leftShiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int result = num << 2;
        System.out.println("The result of left shift operator is : " + result);
        sc.close();
    }
}
