import java.util.Scanner;

public class Prime {
        public static boolean isPrime(int num) {
            if (num < 2) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        public static void generatePrimes(int n) {
            int count = 0, num = 2;
            while (count < n) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter N: ");
            int n = scanner.nextInt();
            scanner.close();


            System.out.println("First " + n + " primenumbers");
            generatePrimes(n);

        }
}

