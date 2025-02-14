import java.util.Scanner;

public class Wether {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Today=scanner.next();
        int temp=scanner.nextInt();
        if(Today.matches("Sun")) {
            if (temp >30) {
                System.out.print("Tommorow also sunny");
            }else{
                System.out.print("Tommorow chance of rain or windy");
            }
        }
       else if(Today.matches("Rain")) {
            if (temp < 30) {
                System.out.print("Tommorow also Rain");
            }else{
                System.out.print("Tommorow chance of fog or windy");
            }
        }else{
                if (temp < 20) {
                    System.out.print("Tommorow also snowy");
                }else{
                    System.out.print("Tommorow chance of rain or snow");
                }
            }
        }
    }

