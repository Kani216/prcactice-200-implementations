import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {100, 200, 300, 400, 50, 600};
        System.out.println(" enter the target ");
        int target = sc.nextInt();
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + end / 2;
            int flag = 0;
            if (arr[mid] == target) {
                System.out.print("the element found at " + mid);
                flag = 1;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;


            } else {

                end = mid - 1;

            }

        if (flag == 0) {
            System.out.print("invalid element");
        }}


    }
}




