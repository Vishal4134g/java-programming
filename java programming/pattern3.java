import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter raw : ");
        int raw = sc.nextInt();

        System.out.print("Enter coloum : ");
        int coloum = sc.nextInt();

        for(int i = 1; i <= raw; i++){
            for(int j = 1; j <= coloum; j++){
                if(i == 1 || j == 1 || i == raw || j == coloum) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}
