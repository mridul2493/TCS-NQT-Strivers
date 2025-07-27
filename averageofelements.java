import java.util.*;
public class averageofelements {
    public static int average(int arr[]){
        int n= arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int average=sum/n;
        return average;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={12,23,34,45,56,67,78,89};
        System.out.println(average(arr));
    }
}