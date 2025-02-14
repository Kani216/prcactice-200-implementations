import java.util.Scanner;

public class Quadratic {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = b * b - 4.0 * a * c;
            char option = sc.next().charAt(0);

            if (d > 0.0) {
                switch (option) {
                    case '+': {
                        System.out.print("the roots are"+(-b + Math.pow(d, 0.5) / (2.0 * a)));

                    }
                    case '-': {
                        System.out.print("and"+(-b - Math.pow(d, 0.5) / (2.0 * a)));
                        break;
                    }
                }
            }else if(d==0.0){
                System.out.print(-b  / (2.0 * a));

            }else{
                System.out.print("No real roots");
            }
        }
    }

