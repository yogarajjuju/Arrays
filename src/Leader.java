import java.util.*;

public class Leader {
    public static void main(String[] args) {
        int[] arr= {8,16,1,2,5,7,4,2};
        ArrayList<Integer> res=  leaders(arr);
        for(int re: res){
            System.out.print(res + " ");
        }
        System.out.println();

    }
    static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n;i++){
            int j=0;
            for(j=i+1;j<n; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
            }
                if(j==n)
                    result.add(arr[i]);



        }
        return result;


    }
}
