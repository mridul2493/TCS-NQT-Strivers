import java.util.*;
public class largestnuminarray {
    public static int largest(int arr[]){
        int large=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={23,45,36,78,69,59,99,88};
        System.out.println(largest(arr));
    }
}