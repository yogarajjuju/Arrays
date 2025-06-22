import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int target= in.nextInt();
        int[ ] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i]= in.nextInt();
        }

        System.out.println(linear(arr,target));
    }
    static int linear(int[] arr ,  int target){
        for(int i =0; i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
         return -1;
    }
}
