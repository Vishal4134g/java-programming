import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr a number : ");
        int num = sc.nextInt();

        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        for( int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
    return true;
    }
}