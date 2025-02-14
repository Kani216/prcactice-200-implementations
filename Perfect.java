import java.util.Scanner;

public class Perfect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int n = sc.nextInt();
        int Sum = 0;
        do {
            if (n % i == 0) {
                Sum += i;



            }
            i++;}
            while (i<n) ;
        System.out.print(Sum + " ");
        if(n==Sum){
            System.out.print("prefect");
        }else{
            System.out.print("Not prefect");
        }



    }
}

