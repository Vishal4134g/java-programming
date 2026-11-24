    import java.util.Scanner;
    public class areaofcircle {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter radius");
            double rad = sc.nextDouble();
            final double PI = 3.14159;  
            double area = PI * rad * rad;
            System.out.println("area of circle is = " + area);
            sc.close();
        }
    }
