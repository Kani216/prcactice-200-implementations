import java.util.Scanner;

public class Income_Tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long income=sc.nextLong();
        String method=sc.next();
        switch(method){
            case"IncomeTax":{
                System.out.println(income*10/100);
            }
            case"RoadTax":{
                System.out.println(income*15/100);
            }
            case"WaterTax":{
                System.out.println(income*25/100);
            }

        }
    }
    }

