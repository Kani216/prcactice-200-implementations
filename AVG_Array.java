import java.util.Scanner;

public class AVG_Array { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    int sum = 0;
    int avg=0;
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }for (int i = 0; i < n; i++) {
        sum+=arr[i];
        avg=sum/n;

    }
    System.out.print(avg);
}
}


