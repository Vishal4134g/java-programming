import java.util.Scanner;
public class Main{

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name :");     
       String name = sc.nextLine();
       System.out.println("Welcome " + name);
       System.out.println(name + ", also tell me your age :");
         int age = sc.nextInt();
         System.out.println(name + " is " + age + " years old.");
         sc.close();
    }
}