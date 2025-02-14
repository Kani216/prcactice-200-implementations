import java.util.Scanner;

public class Number_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int b = sc.nextInt();
       // int a = sc.nextInt();
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.print("one");
            }
            case 2: {
                System.out.print("Two");
            }
            case 3: {
                System.out.print("three");
            }
            case 4: {
                System.out.print("Four");
            }
            case 5: {
                System.out.print("Five");
            }
        }
    }
}
