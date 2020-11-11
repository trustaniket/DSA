import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        int[] arr = {11,10,1,4,12,2,3};
        System.out.println(longestSubsequence(arr));
    }
    static int longestSubsequence(int[] arr){
        int result = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        for(int i : arr){
            if(!set.contains(i-1)){
                int j = i;
                while(set.contains(j)){
                    j++;
                }
                result = Math.max(result, j - i);
            }
        }
        return result;
    }
}
