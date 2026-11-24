public class functionadd {
    public static void main(String[] args) {
        int num1 = 5999999;
        int num2 = 5000000;
        
        int sum = add(num1, num2);

        System.out.println("The sum of two numbers = " + sum);
    }
    public static int add(int num1, int num2) {
        
        int sum = num1 + num2;
        return sum;
    }
}
