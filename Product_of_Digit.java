import java.util.Scanner;

public class Product_of_Digit {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int r= 0;
            int sum=1;
            while (n!=0) {
                r=n%10;
                sum*=r;
                n/=10;
            }
            System.out.print(sum);
        }
    }


