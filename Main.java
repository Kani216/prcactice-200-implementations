import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int b=sc.nextInt();
        int a=sc.nextInt();
        int n=sc.nextInt();
        switch(n)
        {
            case 1:{
                System.out.print(a+b);
            } case 2:{
            System.out.print(a-b);
        } case 3:{
            System.out.print(a*b);
        } case 4:{
            System.out.print(a%b);
        } case 5:{
            System.out.print(a/b);
        }
            default:
                System.out.println(".0000");
        }

        }
    }
