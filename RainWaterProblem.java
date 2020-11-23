public class RainWaterProblem {

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,0,3,1,0,3};
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        int water = 0;
        left[0] = arr[0];
        right[right.length - 1] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > left[i-1]){
                left[i] = arr[i];
            }
            else{
                left[i] = left[i-1];
            }

        }
        for (int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > right[i+1]){
                right[i] = arr[i];
            }
            else{
                right[i] = right[i+1];
            }

        }
        for(int i = 0; i< arr.length; i++){
            water += Math.min(left[i], right[i]) - arr[i];
        }

        System.out.println(water);

    }
}
