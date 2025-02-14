import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value");
        int n = sc.nextInt();
        System.out.println("Your Options"+"1.Even"+"2.Odd"+"3.Sum");
        String str = sc.next();
        do {
            switch(str){
                case "even":{
                    if(n%2==0){
                        System.out.print("it is even");
                    }else{
                        System.out.print("it is not even");
                    }
                    break;

                }
                case "odd":{
                    if(n%2!=0){
                        System.out.print("it is odd");
                    }else{
                        System.out.print("it is not odd");
                    }
                    break;
                }
                case "sum":{
                    System.out.print("Enter value to add with n");
                    int m=sc.nextInt();
                   System.out.print(n+m);

                }
                break;
            }



        }

        while (n>0) ;




    }
}
