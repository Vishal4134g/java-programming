/*import java.util.Scanner;
public class reverseTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to reverse : ");
        int num = sc.nextInt();
        int result = reverseNumber(num);
        System.out.println("Reversed Number : " + result);
        sc.close();
    }
    public static int reverseNumber(int num) {
        int reverse = 0;

        for(; num != 0; num = num / 10){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }

}*/

import java.util.Scanner;

public class reverseTheDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number you want to reverse : ");
        int num = sc.nextInt();

        int reverse = reverseNumber(num);
        System.out.println("Reverse of your number is : " + reverse);

    }

    public static int reverseNumber (int num){
        int reverse = 0;
        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
}