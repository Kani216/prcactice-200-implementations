import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Menu = sc.next();

        switch (Menu) {

            case"january":{
                System.out.print("31 days");
                break;

            }
            case"february":{
                System.out.print("28 days");
                break;
            }
            case"March":{
                System.out.print("31 days");
                break;
            }case"April":{
                System.out.print("30 days");
                break;
            }
            case"May":{
                System.out.print(" 31days");
                break;
            }
            case"June":{
                System.out.print("30 days");
                break;
            }
            case"Agust":{
                System.out.print("31 days");
                break;
            }
            case"September":
            {
                System.out.print("30 days");
                  break;
            }

            case"October":{
                System.out.print("31 days");
                break;

            }
            case"November":{
                System.out.print("30 days");
                break;

            }
            case"December":{
                System.out.print("31 days");
                break;

            }






        }
    }}
