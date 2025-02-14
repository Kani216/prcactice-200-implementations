import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {100, 200, 300, 400, 50, 600};
        System.out.println(" enter the target ");
        int target = sc.nextInt();
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
            int flag = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    System.out.print("the element found at " + i);
                    flag = 1;
                    break;
                }


            }
            if(flag==0){
            System.out.print("invalid element");
        }

        }}




