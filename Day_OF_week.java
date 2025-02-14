import java.util.Scanner;

public class Day_OF_week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int b = sc.nextInt();
        // int a = sc.nextInt();
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.print("Sunday");
                break;
            }
            case 2: {
                System.out.print("Monday");
                break;
            }
            case 3: {
                System.out.print("Tuesday");
                break;
            }
            case 4: {
                System.out.print("Wednesday");
                break;
            }
            case 5: {
                System.out.print("Thursday");
                break;
            }
            case 6: {
                System.out.print("Friday");
                break;
            }
            case 7: {
                System.out.print("Saturday");
                break;
            }


        }
    }
}
