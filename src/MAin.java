import java.sql.SQLOutput;
import java.util.*;
public class MAin {
    public static void main(String[] args) {
        int n = 57283;
        String str = Integer.toString(n);
        int sum =0;
        for(int i =0; i<str.length();i++){
            if(isPrime(i)){
                sum +=str.charAt(i) -'0';

            }

        }
        if(sum%3==0){
            System.out.println("Certified");
        }
        else{
            System.out.println("Not Certified");
        }

    }
    static boolean isPrime(int num){
        if(num<2) return false;
        for(int i =2; i*i <=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
