import java.util.*;
public class countfrequency {
    public static void brute(int arr[]){
        int n= arr.length;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count=count+1;
                }
            }
            System.out.println(arr[i]+" occurs "+count+" times");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={2,3,2,4,4,5,6,5,3,5,5,7};
        brute(arr);
    }
}