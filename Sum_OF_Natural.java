import java.util.Scanner;

public class Sum_OF_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int b = 1;
        int sum = 0;
        while (i<=n) {

    sum+=i;

            i++;
        }
        System.out.print(sum + " ");
    }
}
