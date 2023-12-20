import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> ls=new ArrayList<>();

        for(String x:strs){
            char[] xD=x.toCharArray();
            ls.add(Arrays.toString(xD));
        }


    }
}
