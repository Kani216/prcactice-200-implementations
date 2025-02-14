import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=0;
        int num=0;

        int digit = 0;

        digit=(int)Math.log10(n)+1;
        int temp=n;
        do {

              r=temp%10;

            num+=(int)Math.pow(r,digit);

            temp/=10;

            }

        while (temp>0) ;
        System.out.print(num + " ");
        if(n==num){
            System.out.print("Amstrong");
        }else{
            System.out.print("Not Amstrong");
        }



    }
}
