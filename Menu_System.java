import java.util.Scanner;

public class Menu_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int b = sc.nextInt();
        // int a = sc.nextInt();
        String Menu = sc.next();
        Menu.toLowerCase();
        switch (Menu) {

            case "tea": {
                System.out.print("Tea is ready");
                break;
            }
            case "coffee": {
                System.out.print("coffee is ready");
                break;
            }
            case "dosa": {
                System.out.print("Dosa is ready");
                break;
            }
            case "idly": {
                System.out.print("Idly is ready");
                break;
            }
        }
    }
}
