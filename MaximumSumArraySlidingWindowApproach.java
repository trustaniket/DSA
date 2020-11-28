public class MaximumSumArraySlidingWindowApproach {

    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2,6,7};
        int k = 4;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<k;i++)
        {
            sum += arr[i];
        }

        for(int i = 0; i <arr.length && i+k-1 < arr.length;i++ ){
            if(i != 0)
                sum = sum - arr[i-1] + arr[i+k-1];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
