public class primeNo {
    public static void main(String[] args) {
        int n = 50; // Example: Find all prime numbers up to 50
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
            System.out.println(i);
            }
        }
        }

        public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
