public class Max_sum {
    public static void main(String[] args) {
        int arr[] ={1, -2, 3, 4, -1, 2, 1, -5, 4};
        int maxsum = kadane(arr);
        System.out.println(maxsum);
    }
    static int kadane(int arr[]){
        int max_sum=0;
        int  current_sum=0;
        for(int i=0;i<arr.length;i++){
            current_sum+=arr[i];
            if(current_sum>max_sum){
                max_sum = current_sum;
            }
            if(current_sum<0){
                current_sum=0;
            }
        }
        return max_sum;
    }
}
