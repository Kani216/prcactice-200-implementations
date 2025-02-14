public class Febbanocii {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++) {
            System.out.print(fib(i));
        }
    }
    public static int fib(int n){
        if(n<=1){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }
}
