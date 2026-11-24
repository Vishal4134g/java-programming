import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter raws : ");
        int raws = sc.nextInt();

        //outer loop
        for(int i = 1;i<=raws ; i++){
            //inner loop
            for(int j = 1; j <= i; j++){

                int sum = i + j;
                if (sum % 2 == 0){ //even number
                    System.out.print("1");
                }else { //odd number
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
