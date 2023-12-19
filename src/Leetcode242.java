import java.util.Arrays;
import java.util.HashSet;

public class Leetcode242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] c = s.toCharArray();
        char[] x = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(x);


        if (Arrays.equals(c, x)) return true;

        return false;

    }
}
