import java.util.HashMap;
import java.util.Map;

public class MajorityElementMooreVotingAlgo {

    public static void main(String[] args) {
        int[] arr = {7,2,7,3,7,2,7,7};
        System.out.println(mooreAlgo(arr));
        System.out.println("My method: " + majorCount(arr));
    }

    private static int mooreAlgo(int[] arr){
        int major = 0;
        int count = 1;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == major)
                count++;
            else
                count--;

            if(count == 0){
                major = arr[i];
                count = 1;
            }
        }
        if(count > 0){
            int tempCount = 0;
            for(int i : arr){
                if (i == major)
                    tempCount++;
            }
            if(tempCount < (arr.length/2)){
                return 0;
            }
        }
        return major;
    }

    private static int majorCount(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int ans = arr.length/2;
        for(int i = 0; i< arr.length; i++){
            if(map.get(arr[i]) != null && map.get(arr[i]) > ans){
                return arr[i];
            }
            if(map.get(arr[i]) != null){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > ans)
                return entry.getKey();
        }
        return 0;
    }
}
