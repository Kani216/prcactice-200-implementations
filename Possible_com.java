import java.util.Scanner;

public class Possible_com {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] m = {400, 300, 500, 600};
        int n = m.length;
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= n-1; j++) {
                System.out.print(m[i] );
                System.out.println(m[j]+" " );

            }
        }
    }
}
