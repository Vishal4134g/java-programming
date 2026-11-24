import java.util.Scanner;
public class GreatestNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num_1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num_2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num_3 = sc.nextInt();

        if(num_1 > num_2 && num_1 > num_3) {
            System.out.println("The greatest number is : " + num_1);
        } else if(num_2 > num_3) {
            System.out.println("The greatest number is : " + num_2);
        } else {
            System.out.println("The greatest number is : " + num_3);
        }
    }
}
 