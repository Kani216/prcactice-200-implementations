import java.util.Scanner;

public class Frequency {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = sc.nextLine().toLowerCase();
            sc.close();

            int[] freq = new int[256];//for the askivalue

            for (char c : input.toCharArray()) {
                if (c != ' ') {
                    freq[c]++;
                }
            }

            System.out.println("Character Frequencies:");
            for (int i = 0; i < 256; i++) {
                if (freq[i] > 0) {
                    System.out.println((char) i + " = " + freq[i]);
                }
            }
        }
    }

