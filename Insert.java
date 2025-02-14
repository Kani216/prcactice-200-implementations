import java.util.Arrays;
import java.util.Scanner;

public class Insert {

        public static void main(String [] args){
            Scanner sc= new Scanner(System.in);
            int n =sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i] =sc.nextInt();
            }
            Isort(arr);
        }
        public static void Isort(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                }

            }
            System.out.println(Arrays.toString(arr));

        }

    }




