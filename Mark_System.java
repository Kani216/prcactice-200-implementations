import java.util.Scanner;

public class Mark_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int b = sc.nextInt();
        // int a = sc.nextInt();
        String grade = sc.next();
        switch (grade) {
            case "o": {
                System.out.print("The socere is above 95");
                break;
            }
            case "A+": {
                System.out.print("The socere is above 90");
                break;
            }
            case "A": {
                System.out.print("The socere is above 85");
                break;
            }
            case "B+": {
                System.out.print("The socere is above 80");
                break;
            }
            case "B": {
                System.out.print("The socere is above 75");
                break;
            }
            case "c": {
                System.out.print("The socere is above 70");
                break;
            }
        }
    }
}