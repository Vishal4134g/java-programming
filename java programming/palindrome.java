import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        
        if(isPalindrome(num)){
            System.out.println(num + " is a palindrome number. ");
        }else{
            System.out.println(num + " is not a palindrome number. ");
        }
        sc.close();
    }
    public static boolean isPalindrome(int num){
        int originalnum = num;
        int reversenum = 0;

        while (num > 0){
            int rem = num % 10;
            reversenum = reversenum * 10 + rem;
            num /= 10;

        }
        return originalnum == reversenum; 
    }
}
