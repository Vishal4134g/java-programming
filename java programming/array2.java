import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 5, 6, 87, 53, 86, 99, 66};
        System.out.println("Welcome to Array searching.");
        System.out.print("Enter the number you want to search : ");
        int num = sc.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound) {
            System.out.print("your number was found in the array.");
        }else{
            System.out.print("your number was not found in the array.");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
