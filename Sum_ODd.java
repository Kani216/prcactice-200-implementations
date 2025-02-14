import java.util.Scanner;

public class Sum_ODd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;int sum=0;
        while (i<=n) {


            i+=2;
            sum+=i;

        }
        System.out.print(sum);
    }

}
