public class LargestNumberKSwaps {
    static String max;
    public static void main(String[] args) {
        String str = "38164";
        max = str;
        largestNumKSwaps(str, 2);
        System.out.println(max);
    }
    static void largestNumKSwaps(String str, int k){
        if(Integer.parseInt(str) > Integer.parseInt(max))
            max = str;
        if(k == 0)
            return;


        for(int i = 0; i< str.length() -1; i++){
            for(int j = i+1; j < str.length(); j++){
                if(str.charAt(i) < str.charAt(j)){
                    str = swap(str, i, j);
                    largestNumKSwaps(str, k -1);
                    str = swap(str, i, j);
                }
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char cI = str.charAt(i);
        char cJ = str.charAt(j);

        String left = str.substring(0,i);
        String middle = str.substring(i+1, j);
        String right = str.substring(j+1);
        return left + cJ + middle + cI + right;
    }
}
