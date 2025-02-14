import java.util.Random;
public class Random_pass {
    static String pass_word(int l) {
        StringBuilder str = new StringBuilder();
        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*";
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            str.append(str1.charAt(random.nextInt(str1.length())));
        }

        return str.toString();
    }

    public static void main(String[] args) {
        int l = 10;
System.out.println(pass_word( l));
    }
}




