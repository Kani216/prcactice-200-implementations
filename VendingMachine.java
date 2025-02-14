import java.lang.*;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your option");
        String option = sc.next();
        switch (option) {

            case "c":{

                System.out.println("1.expresso");
                System.out.println("2.Cappuccino Coffee");
                System.out.println("3.Latte Coffee");

                int a=sc.nextInt();
                if(a==1){
                    System.out.println("expresso coffee is ready!enjoy it");

                } else if (a==2) {
                    System.out.println("Cappuccino coffee is ready!enjoy it");

                } else if (a==3) {
                    System.out.println(" Latte coffee is ready!enjoy it");

                }else{
                    System.out.println(" sorry option is un available");
                }
                break;

            }
            case "T" :
                       {
                System.out.println("1. Plain Tea");
                System.out.println("2.Assam Tea");
                System.out.println("3.Ginger Tea");
                System.out.println("4. Cardamom Tea");
                System.out.println("5.emon Tea");
                System.out.println("6.Green Tea");

                int a=sc.nextInt();
                if(a==1){
                    System.out.println("plain is ready!enjoy it");

                } else if (a==2) {
                    System.out.println("assam is ready!enjoy it");

                } else if (a==3) {
                    System.out.println("ginger is ready!enjoy it");

                } else if (a==4) {
                System.out.println("cardamom is ready!enjoy it");

            } else if (a==5) {
                System.out.println("lemon is ready!enjoy it");

            }
                else if (a==6) {
                    System.out.println(" green teais ready!enjoy it");

                } else if (a==7) {
                    System.out.println("is ready!enjoy it");

                } else if (a==8) {
                    System.out.println(" is ready!enjoy it");

                }else{
                    System.out.println(" sorry option is un available");
                }
                           break;

            }
            case "s":{
                System.out.println("1.Hot and Sour Soup");
                System.out.println("2.Veg Corn Soup\n");

                System.out.println("4.Spicy Tomato Soup");
                System.out.println("3.Tomato Soup");

                int a=sc.nextInt();
                if(a==1){
                    System.out.println("Hot and Sour Soup is ready!enjoy it");

                } else if (a==2) {
                    System.out.println("Veg Corn Soup coffee is ready!enjoy it");

                } else if (a==3) {
                    System.out.println(" 4.Spicy Tomato Soup is ready!enjoy it");

                }else{
                    System.out.println(" sorry option is un available");
                }
                break;

            }



            }if(option!="c"&&option!="s"&&option!="T");{
            System.out.println("not vailable");


        }
    }
}
