import java.util.Scanner;

public class Fibbanocii {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a=0;
        int b=1;
int i=0;
        int count=0;
        do{
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
              i++;

        }while(i<=10);



    }
}
