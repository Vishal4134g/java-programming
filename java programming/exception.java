import java.util.Scanner;
    public class exception {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter first number : ");
            int n1 = sc.nextInt();
            System.out.println("Enter second number : ");
            int n2 = sc.nextInt();
            int n3 = 0;
            System.out.println("Value after Devision : "+(n1/n2));
            
            try{
                System.out.println("Value after Devision : "+(n1/n2));
                // This will cause an ArithmeticException if n2 is 0
                n3 = n1/n2;     
                System.out.println("Value after Devision : "+n3);
            }catch(Exception err){
                System.out.println("Error occuried "+err);
                sc.close();
            }
            
        }
    }
