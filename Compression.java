import java.util.Scanner;

public class Compression {
        public static String compress(String str) {
            StringBuilder compressed = new StringBuilder();
            int count = 1;

            for (int i = 0; i < str.length(); i++) {
                if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    compressed.append(str.charAt(i)).append(count);
                    count = 1;
                }
            }

            return compressed.length() < str.length() ? compressed.toString() : str;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            scanner.close();

            System.out.println("Compressed: " + compress(input));
        }
    }


