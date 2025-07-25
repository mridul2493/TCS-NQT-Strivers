import java.util.*;
public class smallestnuminarray {
    public static int smallest(int arr[]){
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={45,36,57,23,50,100,87};
        System.out.println(smallest(arr));
    }
}