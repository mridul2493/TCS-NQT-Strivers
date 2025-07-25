import java.util.*;
public class reversearray {
    public static void brute(int arr[]){
        int n= arr.length;
        int rev[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            rev[j]=arr[i];
            j++;
        }
        for(int x:rev){
            System.out.print(x+" ");
        }
    }
    public static void optimal(int arr[]){
        int n= arr.length;
        int p1=0,p2=n-1;
        while(p1<p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={12,23,45,56,67,78,89};
        brute(arr);
        System.out.println();
        optimal(arr);
    }
}