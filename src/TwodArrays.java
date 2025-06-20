import java.util.Arrays;
import java.util.Scanner;

public class TwodArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n= in.nextInt();
        int [] [] arr = new int[m][n];
        for(int i = 0; i < arr.length ; i++) {
            for(int j = 0; j< arr[i].length; j++){
                arr[i][j] = in.nextInt();


        }
        }
        // way 1
//        for(int i = 0; i < arr.length ; i++) {
//            for(int j = 0; j< arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//
//
//            }
//            System.out.println();
//        }
        // way 2
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}