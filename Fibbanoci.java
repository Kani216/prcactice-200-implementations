import java.util.Scanner;

public class Fibbanoci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= 0;
        int b=1;
        int i=0;
        while (i<=n) {

            System.out.print(a+" ");

          int temp=a+b;
          a=b;
          b=temp;
          i++;

        }

    }
}
