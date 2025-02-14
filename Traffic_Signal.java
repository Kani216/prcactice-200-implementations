import java.util.Scanner;

public class Traffic_Signal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Menu = sc.next();
       String str= Menu.toUpperCase();

        switch (str) {
            case"RED":
            {
                System.out.print("Stop");
                break;
            } case"GREEN":
            {
                System.out.print("go");
                break;
            }
            case"YELLOW":
            {
                System.out.print("Wait");
                break;
            }
        }

    }
}