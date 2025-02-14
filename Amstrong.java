public class Amstrong {
    public static void main(String[] args) {
        int n=9474;

        int digit=(int)Math.log10(n)+1;
        int sum=Amstrong(digit, n);
        System.out.print(sum);
        if(sum==n){
            System.out.print("is amstrong");
        }else{
            System.out.print("Not amstrong");
        }


    }
    public static int Amstrong(int digit,int n){
        if(n==0){
            return 1;

        }
        int r=n%10;
        return(int) Math.pow(r,digit)+Amstrong(n/10,digit);
    }
}
