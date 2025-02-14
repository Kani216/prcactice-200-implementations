import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the given array 1");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<=n;i++){

            arr[i]= sc.nextInt();
            System.out.println("the elements of array 1"+arr[i]);
        }
        for(int i=0;i<n;i++){
            int sum=arr[i]+arr[i+1];
            System.out.println("the sum of elements 1"+sum);
        }
    }
}
