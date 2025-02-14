public class Max {
    public static void main(String[] args) {
        int arr[]={100,800,200,400};
        System.out.print(maxelem(arr));
    }
    static int maxelem(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (max < arr[i]) {
max=arr[i];
            }
        }

    return max;}
}
