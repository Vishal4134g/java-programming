import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of raw : ");
        int raw = sc.nextInt();

        System.out.println("Enter number of coloum");
        int coloum = sc.nextInt();

        for(int i = 1; i <= raw; i++){
            for(int j = 1; j <= coloum; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}