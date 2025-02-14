import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int r=0;
        int count=0;
        do{
            r=n%10;
            count++;
            n/=10;


        }while(n!=0);
        System.out.print(count+" ");


    }
}
