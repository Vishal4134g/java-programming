//long method

/*import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int first = sc.nextInt();
        System.out.println("Enter another number : ");
        int second = sc.nextInt();
        int gcd = gcd(first, second);
        System.out.println("GCD of the number is : " + gcd);
    }
    public static int gcd(int first, int second) {
        int gcd = 1;
        int least = least(first, second);
        for(int i = 2; i <= least; i++){
            if(first % i == 0 && second % i ==0){
                gcd = i;
            }
        }

        return gcd;
    }

    public static int least( int first, int second) {
        if(first < second) {
            return first;
        } else {
            return second;
        }
    }

}
*/

//short method

import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        while(n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }else{
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is = " + n2);
    sc.close();
    }
}