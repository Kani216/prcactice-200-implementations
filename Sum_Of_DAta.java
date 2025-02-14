import java.util.Scanner;

public class Sum_Of_DAta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int digit=(int)Math.log10(n)+1;
        int r=0;
        for(int i=0;i<digit;i++){
            int temp=n;
            r=r+n%10;
        n=n/10;


        }
        System.out.println(r);
    }
}