import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int i=1;


        do {

            int m=1;
       do{
           System.out.print("*");
           m++;

       }while(m<=i);
            System.out.println();
i++;
        } while (i<=n);


    }
}
