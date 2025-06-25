public class k {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 4, 2, 3};
        int m =6;

        int max = 0;

        for(int i =0;i<arr.length ;i++){
            int sum =0;
            for (int j =i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==m){
                    int len = j-i+1;
                    if(len>max){
                        max=len;
                    }
                }
            }

        }
        System.out.print(max);
    }
}
