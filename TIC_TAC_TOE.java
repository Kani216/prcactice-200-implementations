import java.util.Scanner;

public class TIC_TAC_TOE {
   // public static void main(String [] args) {
    //System.out.print(tictactoe);
//    }

       // Scanner sc = new Scanner(System.in);
       // static void tictactoe {
         //   char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
          //  for (int i = 0; i < 9; i++) {
           //     System.out.print("enter the row and coloumn(0-2)");
             //   int row = sc.nextInt();
               // int col = sc.nextInt();
                //board[row][col] = (i % 2 == 0) ? 'o' : 'x';
            //}
       // public class TicTacToe {
            public static void main(String[] args) {
                char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < 9; i++) {
                    System.out.println("Enter row and column (0-2): ");
                    int row = sc.nextInt();
                    int col = sc.nextInt();
                    board[row][col] = (i % 2 == 0) ? 'X' : 'O';
                }
                System.out.println("Game Over!");
                sc.close();
            }
        }





