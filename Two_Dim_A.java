import java.util.Arrays;
import java.util.Scanner;

public class Two_Dim_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();

        int[][] m = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int d = m.length;

       // for (int i = 0; i <m.length; i++) {
           // for (int j = 0; j <m[i].length; j++) {
            //    System.out.print(m[i][j]+" ");
          //  }
        for(int[] row:m){
            System.out.print(Arrays.toString(row));
        }
    }
}
