import java.util.Scanner;
public class PerimeterOfRectangular{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangular : ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangular : ");
        double breadth = sc.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangular is : " + perimeter + ".");
        sc.close();
    }
}