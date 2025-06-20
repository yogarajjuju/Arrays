import java.util.*;
public class Maxseat {
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1,0,0,0,1};
        int zero =0;
        int count=0;
        boolean bet=false;

        for(int i=0; i< arr.length;i++){
           if(arr[i]==1){
               if(bet && count>zero){
                   zero = count;
               }
               count =0;
               bet=true;
           } else if (bet) {
               count++;
               
           }


        }
        System.out.println(Math.max(count,zero));

    }

}
