import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if(i%1==0&&i%i==0&&i%i+1!=0){
                System.out.print(i);

            }
        }
        }
    }