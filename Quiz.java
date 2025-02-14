import java.util.Scanner;

public class Quiz {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] questions = {
                    "What is java related?",
                    "What the valuemof int?",
                    "What is 5 + 3?"
            };

            String[] options = {
                    "a) Program  b) oops  c) language",
                    "a) 3 b) 4  c) 6",
                    "a) 6  b) 8  c) 10"
            };

            char[] answers = {'b', 'b', 'b'};
            int score = 0;

            for (int i = 0; i < questions.length; i++) {
                System.out.println( (i + 1) + ". " + questions[i]);
                System.out.println(options[i]);
                System.out.print("Your answer: ");
                char userAnswer = scanner.next().toLowerCase().charAt(0);

                if (userAnswer == answers[i]) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer is " + answers[i]);
                }
            }

        }
    }

