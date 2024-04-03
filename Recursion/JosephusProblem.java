import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JosephusProblem {

    public static int winner(int n, int k) {
        int[] arr = new int[n];
        List<Integer> list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
            list.add(i);
        }
        // System.out.println(list);
        return rec(list, 0, k);

    }

    public static int rec(List<Integer> arr, int index, int k) {
        if (arr.size() > 1) {
            int removeIndex = (index + k - 1) % arr.size();
            arr.remove(removeIndex);
            System.out.println(arr);
            try {
                rec(arr, removeIndex, k);

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return arr.get(0);
    }

    public static void main(String[] args) {
        System.out.println(winner(6, 2));

    }
}
