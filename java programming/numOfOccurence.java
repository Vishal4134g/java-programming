import java.util.Scanner;

public class numOfOccurence {
    public static void main(String[] args) {
        System.out.println("Welcome to array occurance.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of an Array");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Now enter the number you want to find : ");
        int num = sc.nextInt();
        int occurence = occurences(arr, num);
        System.out.print("Your elements was found " + occurence + " times in the array");

    }
    public static int occurences (int[] arr, int num) {
        int occ = 0;
            
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                occ++;
            }
        }

    return occ;
    }
}
