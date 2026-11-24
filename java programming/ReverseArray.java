import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array reverse ");
        System.out.print("Enter the size of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of an Array : ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
            
        reverse(arr);

        System.out.print("Here is your new Array : ");
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
        }
    }
}
