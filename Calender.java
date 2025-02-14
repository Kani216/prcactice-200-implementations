import java.util.Scanner;

public class Calender {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of days in the month: ");
            int days = scanner.nextInt();

            System.out.print("Enter the starting day of the month (1 for Monday, 7 for Sunday): ");
            int startDay = scanner.nextInt();

            System.out.println("\nMon Tue Wed Thu Fri Sat Sun");
            int currentDay = 1;

            for (int i = 1; i < startDay; i++) {
                System.out.print("    ");
            }

            for (int i = startDay; currentDay <= days; i++) {
                System.out.printf("%3d ", currentDay);
                if (i % 7 == 0) {
                    System.out.println();
                }
                currentDay++;
            }

            scanner.close();
        }
    }


