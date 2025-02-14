import java.util.Scanner;

public class Text_Based {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The number guess game");
        System.out.print("enter the num");
        int num=sc.nextInt();
        int target=90;
        if(num==target){
            System.out.print("your guess is correct");

        }else if(num<target){
            System.out.print("your guess is too low");

        }else{
            System.out.print("your guess is too high");
        }


    }
}
