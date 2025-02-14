import java.util.Scanner;

public class Pair_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int target_sum = 20;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = arr[j] + arr[i];
                System.out.print(sum);

                if (sum == target_sum) {
                    System.out.println("THE Pair with given sum id found"+arr[i]+arr[j]);
                    break;
                } else {
                    System.out.println("THE Pair with given sum is not found");
                }
            }}

    }
}
