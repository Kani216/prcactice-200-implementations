import java.util.Scanner;

public class Non_Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int target = 0;
        int count=0;
        int ele=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    target = arr[i];
                    count++;
                }if(count>1){
                  ele=  arr[i];
                }
            }

        }System.out.print(ele);
    }
}
