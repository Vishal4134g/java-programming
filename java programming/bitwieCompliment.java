import java.util.Scanner;
public class bitwieCompliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        int result = ~ num;
        System.out.println("The result of Bitwise Complement is : " + result);
        sc.close();
    }
}