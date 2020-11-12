import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordBreakRecursiveMemoization {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("i");
        dictionary.add("am");
        dictionary.add("ace");
        String str = "iamace";
        Map<String, Boolean> map = new HashMap<>();
        System.out.println(wordBreak(str, dictionary, map));
    }

    static boolean wordBreak(String word, Set<String> dictionary, Map<String, Boolean> map){
        if(word.equals("")){
            return true;
        }
        if(map.containsKey(word)){
            return map.get(word);
        }
        for (int i = 1; i<= word.length(); i++){
            if(dictionary.contains(word.substring(0, i)) && wordBreak(word.substring(i), dictionary, map)){
                map.put(word.substring(i), true);
                return true;
            }
        }
        map.put(word, false);
        return false;
    }
}
