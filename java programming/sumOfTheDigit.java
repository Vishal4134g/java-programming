import java.util.Scanner;
public class sumOfTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a digit : ");
            int num = sc.nextInt();
        
        int sum = 0;
        while( num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of all integer is : " + sum);
    }
}
