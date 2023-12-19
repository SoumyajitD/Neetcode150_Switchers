import java.util.Collections;
import java.util.HashSet;

class Leetcode217 {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 1};
        containsDup(t);
    }

    public static boolean containsDup(int[] n) {

        int l = n.length;
        HashSet<Integer> hS = new HashSet<>();
        for (int x : n) {
            hS.add(x);
        }

        int ll = hS.size();
        System.out.println(hS.size());
        System.out.println(l);
        if (l != ll) {
            return true;
        }

        return false;


    }
}
