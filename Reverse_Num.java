import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int r=0;
        do{
            r=n%10+r*10;
            n/=10;


        }while(n!=0);
        System.out.print(r+" ");


    }
}
