import java.util.Scanner;

public class Currency_Converter {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //int b = sc.nextInt();
            int a = sc.nextInt();
            String n = sc.next();
            switch (n) {
                case "Dollar": {
                    System.out.print(a*0.014+"in dollars");
                }
                case"Dhiram": {
                    System.out.print(a*0.042+"in dhiram");
                }
                case "turkish": {
                    System.out.print(a*0.21+"in turkish");
                }

            }
        }
    }


