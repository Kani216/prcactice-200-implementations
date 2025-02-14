import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class Count_Alpha_Cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "hello World";
        int n = str.length();
        char ch = ' ';
        int vow = 0;
        int cons = 0;
        for (int i = 0; i <= n - 1; i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow++;


            } else {
                cons++;
            }

        }
        System.out.println("the vowel count "+vow);
        System.out.print("the cons count "+cons);
    }
    }

