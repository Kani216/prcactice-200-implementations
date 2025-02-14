import java.util.Scanner;

public class Factorial_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = arr[0];
        for (int i = 0; i < n; i++) {
            if(target<arr[i]){
                target=arr[i];
            }
        }
        System.out.println("The largest"+target);
        int fact=1;
        for (int i = 1; i <= target; i++) {
            fact =fact*i;

        }
        System.out.println(fact);
    }
}
