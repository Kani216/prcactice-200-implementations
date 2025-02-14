import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value=1;
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j= 1; j<= n-i; j++) {
                System.out.print(" ");}
            for (int j = 1; j<=( 2*i)-1; j++) {
               value=value*((i-j)/j);
                System.out.print(value);


            }
            System.out.println();

        }
    }
}
