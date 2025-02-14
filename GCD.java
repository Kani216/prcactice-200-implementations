import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int count=0;
        do{
            int temp=b%a;
            a=b;
            b=temp;


        }while(a<b);
        System.out.print(b+" ");


    }
}
