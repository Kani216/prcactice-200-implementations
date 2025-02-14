import java.util.Scanner;

public class TwoD_Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] m = {{1, 2,3 }, {3,6,4}};
        int[][] n = {{1, 1,5}, {1,1,5}};
        int row = m.length;
        int col = m[0].length;
        int mul[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mul[i][j] = m[i][j] + n[i][j];
            }}
            System.out.println("result matrix");
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(mul[i][j] + " ");
                }
System.out.println();
            }
        }

    }

