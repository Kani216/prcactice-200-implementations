public class Febbanocii {
        public static int feb(int n){
            if(n<=1){
                return 1;}
            return feb(n-2)+feb(n-1);
        }

        public static void main(String[] args) {
            int n=8;
            for(int i=0;i<=n;i++) {
                System.out.println(" the feb series of" + feb(i));

            }
        }
    }

