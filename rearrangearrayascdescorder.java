import java.util.*;
public class rearrangearrayascdescorder {
    public static void arrange(int arr[]){
        int n= arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int j=n-1;j>n/2;j--){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={89,56,78,34,99,43,34,23};
        arrange(arr);
    }
}