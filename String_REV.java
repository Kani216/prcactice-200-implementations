import java.util.Scanner;
import java.lang.*;
public class String_REV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String rev="";
        int n = str.length()-1;
        //String rev=" ";
        //char ch=0;

        do {

           // ch = str.charAt(n);
            rev+=str.charAt(n);
            n--;



        } while (n>=0);

        //System.out.print(rev);
        if(str.equals(rev)){
            System.out.println("palindrom");
        }else{
            System.out.println("Not palindrom");
        }
    }
}
