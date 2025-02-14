import java.util.Scanner;

public class Ticket {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Operation t=new Operation();

            System.out.print("Welcome");
            System.out.print("Enter Destination");
            String destination=sc.next();
            System.out.print("Enter the num of ticket");
            int num=sc.nextInt();
            int Present=130;
            int Booked_SEAT=70;
            t.Availablity(num,Booked_SEAT,Present);
            t.Booking(num,Present);

        }
    }
    class Operation {
        public static void Availablity(int num, int Booked_SEAT, int Present) {
            int Availablity = Present - Booked_SEAT;
            if (Availablity > 0) {
                System.out.print("Ticket available");
            }
        }

        public static void Booking(int num,  int Present) {
            if (Present != 130) {
                Present += num;
            }

            System.out.print("your tickets booked");
            System.out.print("total seats available"+Present);
        }
    }



