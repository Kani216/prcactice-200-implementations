import java.util.Arrays;
import java.util.Scanner;

public class Student_Record {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[]=new String[3];
        String roll[]=new String[3];
        int mathmark[]=new int[3];
        int Sciencemark[]=new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
            roll[i]=sc.next();
            mathmark[i]=sc.nextInt();
            Sciencemark[i]=sc.nextInt();
        }
      System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(roll));
        System.out.println(Arrays.toString(mathmark));System.out.println(Arrays.toString(Sciencemark));


    }
}
