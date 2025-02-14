import java.util.Random;
import java.util.Scanner;

public class TE_Game {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            String[] choices = {"rock", "paper", "scissors"};

            System.out.print("Enter Rock, Paper, or Scissors: ");
            String playerChoice = sc.next().toLowerCase();

            String computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win! ");
            } else {
                System.out.println("You lose! ");
            }

            sc.close();
        }
    }


