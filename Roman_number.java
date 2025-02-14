import java.util.Scanner;

public class Roman_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int b = sc.nextInt();
        // int a = sc.nextInt();
        String ch = sc.next();
        switch (ch) {
            case "I": {
                System.out.print("one");
                break;
            }
            case "II": {
                System.out.print("TW0");
                break;
            }
            case "III": {
                System.out.print("Three");
                break;
            }
            case "IV": {
                System.out.print("Four");
                break;
            }
            case "V": {
                System.out.print("Five");
                break;
            }
            case "X": {
                System.out.print("ten");
                break;
            }
            case "M": {
                System.out.print("Thousand");
                break;
            }


        }
    }
}
