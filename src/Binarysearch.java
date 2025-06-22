import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int target = in.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
//        Arrays.sort(arr);
        System.out.println(Bs(arr,target));
    }
    static  int Bs(int arr[] , int target){
        int start=0, end = arr.length-1;
        while(start <=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;

            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
