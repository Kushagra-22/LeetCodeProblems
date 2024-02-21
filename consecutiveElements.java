import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class consecutiveElements {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int longest = 1;
        Set<Integer> s = new HashSet<>();
        for (int t : nums) {
            s.add(t);
        }

        for (int it : s) {
            if (!s.contains(it - 1)) {
                int count = 1;
                int x = it;
                while (s.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }
                longest = Math.max(longest, count);

            }
        }


        return longest;
    }

    public static void main(String[] args) {
        consecutiveElements c = new consecutiveElements();

        int[] a = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(c.longestConsecutive(a));
        System.out.println(a);


    }
}
