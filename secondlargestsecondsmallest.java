import java.util.*;
public class secondlargestsecondsmallest {
    public static int secondlargest(int arr[]){
        int large=arr[0];
        int large2=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>large){
                int temp=large;
                large=arr[i];
                large2=temp;
            }
        }
        return large2;
    }
    public static int secondSmallest(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1; // or throw exception
        }

        int small = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small2 = small;
                small = arr[i];
            } else if (arr[i] > small && arr[i] < small2) {
                small2 = arr[i];
            }
        }

        if (small2 == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found (all elements may be equal).");
            return -1;
        }

        return small2;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={23,67,56,45,89,87,99};
        System.out.println(secondlargest(arr));
        System.out.println(secondSmallest(arr));
    }
}