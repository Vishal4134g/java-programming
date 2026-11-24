import java.util.*;

class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a integer");
        int a = sc.nextInt();
        System.out.println("value is : "+a);
        sc.nextLine();



        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("value is : "+ str);


        sc.close();
    }
}