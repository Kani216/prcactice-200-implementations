import java.util.Scanner;

public class Input_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String method = sc.next();
        String str="Hello world";
        str.trim();
        if(method.matches(str)){
            System.out.print("The input is valid");

        }
    }
}
