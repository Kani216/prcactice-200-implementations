import java.util.Scanner;

public class FharenHeit_celecius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int temperatur=sc.nextInt();

    String Menu = sc.next();

        switch(Menu)

    {

        case "Celusius": {
            int Celusius=(5/9)*(temperatur-32);
            System.out.print(Celusius);
            break;
        }
        case "Fhareinhiet": {
            int Fhareinhiet= ((5/9)*temperatur)+32;
            System.out.print(Fhareinhiet);
            break;
        }

    }
}
}
