import java.util.Scanner;

public class Even_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}

