import java.util.Scanner;

public class Left_rotate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int d=sc.nextInt();
        System.out.print(rotateString(str,d));
    }
    public static String rotateString(String str, int d){
        int n=str.length();
        d=d%n;

        return str.substring(d)+str.substring(0,d);
    }


}
