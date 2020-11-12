public class MinimumSwapsSortArray {
    static int minimumSwaps(int[] arr) {
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == i+1)
                continue;
            else{
                for(int j = i+1; j< arr.length;j++){
                    if(arr[j] == i+1){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        count++;
                        break;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,6,7};
        System.out.println(minimumSwaps(arr));
    }
}
