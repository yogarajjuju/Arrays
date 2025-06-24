public class Missingnum {
    public static void main(String[] args) {
        int arr[] ={1,2,4,5};

//        for(int i =0;i< arr.length;i++){
//            if(arr[i]!=i+1){
//                System.out.println(i+1);
//                return;
//            }
//        }
//        System.out.println(arr.length+1); //  bruteforce
        int n = arr.length+1;
        int expect = n*(n+1)/2;//optimal
        int actual = 0;
        for(int num:arr){
            actual += num;
        }
        int miss = expect - actual;
        System.out.println(miss);
    }

}
