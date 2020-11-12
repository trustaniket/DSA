import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakDP {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("i");
        dictionary.add("am");
        dictionary.add("ace");
        dictionary.add("xx");
        String str = "aceami";
        System.out.println(breakWordDP(str, dictionary));
    }

    static String breakWordDP(String word, Set<String> dictionary){
        List<String> list = new ArrayList<>();
        boolean[] dp = new boolean[word.length() + 1];
        dp[0] = true;
        for(int l = 1; l <= word.length(); l++){
            for(int i = 0; i < l; i++){
                if(dp[i] && dictionary.contains(word.substring(i,l))){
                    list.add(word.substring(i,l));
                    dp[l] = true;
                    break;
                }
            }
        }
        if(dp[word.length()]) {
            String output = "";
            for (String s : list){
                output = output + " " + s;
            }
            return output.trim();
        }
        return "";
    }
}
