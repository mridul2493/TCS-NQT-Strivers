import java.util.*;
public class rotatearrayblockswap {
    public static void brute(int arr[], int k){
        int n= arr.length;
        while(k>0){
            int temp=arr[0];
            for(int i=1;i<n;i++){
                arr[i-1]=arr[i];
            }
            arr[n-1]=temp;
            k--;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7};
        int k=7;
        brute(arr,k);
    }
}