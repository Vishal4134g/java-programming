import java.util.Scanner;
public class fibonacci { //fibonacci seriese : 0112358
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number : ");
        int num = sc.nextInt();

        System.out.println("Here is the Fibonacci series : ");
        printFibonacci(num);
    sc.close();
    }

    public static void printFibonacci(int num) {
        if ( num < 0 ) return;
        System.out.println("0");
        if ( num == 0 ) return;
        System.out.println("1");

        int first  = 0, second = 1;
        while(first + second <= num) {
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
    }
}
