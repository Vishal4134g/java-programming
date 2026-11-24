import java.util.Scanner;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temprreture in fahreinheit: ");
        double fahreinheit = sc.nextDouble();
        double celcius = (fahreinheit - 32) * 5 / 9;
        System.out.println("Tempreture in celcius : " + celcius);
        sc.close();
    }
}