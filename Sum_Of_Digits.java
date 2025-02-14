import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r= 0;
        int sum=0;
        while (n!=0) {
            r=n%10;
            sum=sum+r;
            n/=10;
        }
        System.out.print(sum);
    }
}

