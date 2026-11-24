public class Parameter {
    public static void main(String[] args){
        //int num = sumTwoNumbers(5, 6); // pass Arguments
        //System.out.println("The sum is : " + num); 
        System.out.println(sumTwoNumbers(5, 9));// pass Arguments
        System.out.println(sumTwoNumbers(30, 50));// pass Arguments
        System.out.println(sumTwoNumbers(-65, 65));// pass Arguments
    }

    public static int sumTwoNumbers(int first, int second) /* pass Parameters */ {
        System.out.println("The first number is : " + first);
        System.out.println("The second number is : " + second);
        int sum = first + second;

        return sum;
    }
}
