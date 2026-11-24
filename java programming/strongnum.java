import java.util.Scanner;
public class strongnum{
    public static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f * i;
        }
        return f;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number : ");
            int n = sc.nextInt();
            sc.close();
            int sum = 0,n1=n;
            while(n>0){
                int d = n % 10;
                sum = sum + fact(d);
                n = n / 10;
            }
            if (sum == n1){
                System.out.println(n1 + " is a strong number. ");
            }else{
                System.out.println(n1 + " is not a strong number. ");
            }
    }
}