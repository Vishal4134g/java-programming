public class average {
    public static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num; // sum = sum + num;
        }
        return (double) sum / arr.length; // Cast to double for accurate average
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        double avg = average(numbers);
        System.out.println("The average is: " + avg);
    }
}
