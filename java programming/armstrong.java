import java.util.Scanner;
public class armstrong {
    public static boolean isArmstrong(int num){
        //finding the digit in number
        int digit = num;
        int count = 0;
        while(digit > 0){
            digit = digit / 10;
            count++;
        }
        digit = num;
        //finding the sum of digit raised to the power of count
        int sum = 0;
        while (digit > 0){
            int rem = digit % 10;
            sum += Math.pow(rem , count);
            digit = digit / 10;
        }
        //checking that the sum is equal to the number or not
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println(num + " is an armstrong number. ");
        }else{
            System.out.println(num + " is not an armstrong number. ");
        }
    }
}
