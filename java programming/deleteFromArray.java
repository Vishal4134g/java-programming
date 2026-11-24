import java.util.Scanner;
public class deleteFromArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array deletion.");

        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of an Array : ");

        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Now, enter the number you want to delete : ");
        int numToDelete = sc.nextInt();
        
        int[] newArr = deleteNumber(arr, numToDelete);
        
        System.out.print("Here is your new Array : ");
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

    }
    public static int[] deleteNumber(int[] arr, int numToDelete){
        int occ = 0;
            
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == numToDelete) {
                occ++;
            }
        }
        if(occ == 0){
            return arr;
        }

        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while(i < arr.length) {
            if (arr[i] != numToDelete) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
   
        return newArr;
    }
}