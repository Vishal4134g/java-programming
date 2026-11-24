import java.util.Scanner;
public class age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if ( age >= 60 ) {
            System.out.println("You are a senior.");
        }
        else if( age <60 && age >= 20 ) {
            System.out.println("You are an Adult.");
        }
        else if( age < 20 ) {
            System.out.println("Your are a Teenager.");
        }
        else {
            System.out.println("You are a child.");
        }
        sc.close();
    }
}
