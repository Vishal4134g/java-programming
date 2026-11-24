//long method

/*import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong.");
        } else {
            System.out.println("Your number is not Armstrong.");
        }

    }
     
    public static boolean isArmstrong(int num) {
        int noOfDigit = noOfDigit(num);
        System.out.println("No Of Digit : " + noOfDigit);
        int numCopy = num;
        int finalNumber = 0;
        while(num > 0) {
            int lastDigit = num % 10; 
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigit);
        }
        System.out.println("final number is : " + finalNumber);
    return finalNumber == numCopy;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while(i < num2) {
            result *= num1;
            i++;
        }
        System.out.println("Pow of " + num1 + " is " + result);
        return result;
    }
    public static int noOfDigit( int num ) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num /= 10;
        } 
        return digit;
    }
}*/

//short method


import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arm = 0, temp;
        System.out.println("Enetr a number ");
        int num = sc.nextInt();
        temp = num;

        while(num>0) {
            int rem = num % 10;
            arm = rem * rem * rem + arm;
            num = num / 10;
        }
        if (temp == arm) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    sc.close();
    }
}
