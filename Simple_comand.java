import java.util.Scanner;

public class Simple_comand {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String Today=scanner.next();
            //int temp=scanner.nextInt();
            if(Today.matches("hi")) {
                    System.out.print("hi how was your day");
                }

            else if(Today.matches("I am fine")) {
                System.out.print("How can i help you");
                if (Today.matches("today wether")) {
                    System.out.print("sunny ");
                }else{
                    System.out.print("Tommorow chance of fog or windy");
                }
            }else{

                    System.out.print("Thankyou");

            }
        }
    }



