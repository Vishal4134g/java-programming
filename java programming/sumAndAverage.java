public class sumAndAverage {
   public static void main(String[] args) {
       int[] arr = {23, 56, 4, 78, 12, 99, 50, 60};

       int sum = 0;

       for (int i = 0; i< arr.length; i++) {
        sum += arr[i];
       }

       double average = (double)sum / arr.length;

       System.out.println("The sum of all elements is : " + sum);
       System.out.println("The Average of all elements is : " + average);
   }
}
