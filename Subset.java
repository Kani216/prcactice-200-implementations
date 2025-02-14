import java.util.Scanner;

public class Subset {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size");
            int n = sc.nextInt();
            System.out.print("Enter the element");
            int arr[] = new int[n];

            int ar[] = new int[n - 2];

            int count = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.print("Enter the element of array2");
            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
            for (int j = 0; j < arr.length; j++) {
                for (int i = 0; i < ar.length; i++) {
                    ar[i] = arr[j];
                    count++;
                }
            }
            if (count > 1) {
                System.out.print("it is subset");
            } else {
                System.out.print("it is not subset");
            }
        }
    }
