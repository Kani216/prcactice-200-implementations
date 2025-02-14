import java.util.Scanner;

public class Fabanocii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            System.out.println(a+" ");  // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
          int temp=a+b;
          a=b;
          b=temp;

        }

    }
}
