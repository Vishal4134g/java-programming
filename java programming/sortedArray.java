import java.util.Scanner;

public class sortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in the sorted Array : ");

        System.out.print("Enter the size of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of an Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isInc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);

        if (isInc || isDec) {
            System.out.println("Your Array is sorted.");
        } else {
            System.out.println("Your Array is not sorted.");
        }
    }

    public static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
