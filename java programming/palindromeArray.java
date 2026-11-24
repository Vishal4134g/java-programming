import java.util.Scanner;
public class palindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of an Array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }
        boolean isPalin = isPalindrome(arr);
        if(isPalin) {
            System.out.print("Your number is palindrome.");
        } else {
            System.out.print("Your number is not palindrome.");
        }
    }  

    public static boolean isPalindrome(int[] arr) {
        for(int i = 0;i < arr.length; i++){
            if(arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
