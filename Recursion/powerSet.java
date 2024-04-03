import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class powerSet {

    public static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(arr, output, index, ans);
        return ans;
    }

    public static void solve(int[] arr, List<Integer> output, int index, List<List<Integer>> ans) {
        if (index >= arr.length) {
            ans.add(output);
            return;
        }
        solve(arr, output, index + 1, ans);
        output.add(arr[index]);
        solve(arr, output, index + 1, ans); 

    }

    public static void main(String[] args) {
        // Vector<Integer> arr={1,2,3};
        int[] arr = { 1, 2 };
        System.out.println(subSet(arr));
    }
}
