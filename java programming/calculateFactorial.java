import java.util.Scanner;
public class calculateFactorial {
    public static void main(String[] args){
        int result = factorial();
        System.out.println("The factorial is: " + result);
    }


    public static int factorial() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number to calculate factorial: ");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i; // fact = fact * i;
        }
        return(fact);
    }
}
