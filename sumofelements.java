import java.util.*;
public class sumofelements {
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={12,23,4,56,7,88};
        System.out.println(sum(arr));
    }
}