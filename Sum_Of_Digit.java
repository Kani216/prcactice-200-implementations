import java.util.Scanner;

public class Sum_Of_Digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int r=0;
        int Sum=0;
        do{
            r=n%10;
          Sum+=r;
            n/=10;


        }while(n!=0);
        System.out.print(Sum+" ");


    }
}
