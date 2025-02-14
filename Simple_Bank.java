import java.util.Scanner;

public class Simple_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("enter your option");
        System.out.print("1.Withdraw");
        System.out.print("2.Deposit");
        System.out.print("3.Transfer");
        String Menu = sc.next();
        int amount=500000;


      //  int tamount=sc.nextInt();

        switch (Menu) {
            case"withdraw":{
                System.out.print("enter amount to with draw");
                int Wamount=sc.nextInt();
                  amount=amount-Wamount;
                System.out.print(amount);
                break;
 }
            case"Deposite":{
                System.out.print("enter amount to deposite");
                int damount=sc.nextInt();
                amount=amount+damount;
                System.out.print(amount);
                break;
            }
        }
    }
}