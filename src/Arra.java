public class Arra {
    public static void main(String[] args) {
        int arr [] =  { 4, 9, 2, 7, 5};
        int max = arr[0];
        for(int i =0; i< arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
              int index = i;
                System.out.println(index);
            }

        }

    }
}
