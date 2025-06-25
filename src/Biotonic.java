public class Biotonic {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,0,1,0};
        boolean ans = isBiot(arr);
        System.out.println(ans);

    }
    static boolean isBiot(int arr[]){
        if(arr.length<3) return false;
        int peak = bs(arr);
        for(int i =0; i<peak;i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
            for(int i = peak ;i<arr.length-1;i++){
                if(arr[i]<=arr[i+1]){
                    return false;
                }
            }

        return true;

    }
    static int bs(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;

            } else {
                start = mid+1;
            }
        }
        return start;
    }

}
