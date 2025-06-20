import java.util.*;
public class Arr {
    public static void main(String[] args) {
        int arr[] ={-10,-4,-3,2,5,6,9};
        for(int i = 0; i < arr.length; i++) {
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==-1){
                    System.out.println((arr[i]+","+arr[j]));
                }
            }

        }
    }
}
