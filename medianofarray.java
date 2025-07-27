import java.util.*;
public class medianofarray {
    public static int median(int arr[]){
        int n= arr.length;
        if(n%2==0){
            int n1=n/2;
            int n2=(n/2)-1;
            int median = (arr[n1]+arr[n2])/2;
            return median;
        }
        else{
            int n1=(n+1)/2;
            int median =arr[n1];
            return median;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={2,3,1,6,7,3,2,4,9,8};
        System.out.println(median(arr));
    }
}