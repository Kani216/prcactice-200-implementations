import java.util.Arrays;
import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size");
        int n = sc.nextInt();
        System.out.print("Enter the element");
        int arr[] = new int[n];

        int ar[] = new int[n];
        int a[] = new int[n + n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the element of array2");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(ar);
        for (int i = 0; i<= a.length; i++) {
            if(ar[i] == arr[i]){
                System.out.print(a[i]);

            }
        }
    }
}
