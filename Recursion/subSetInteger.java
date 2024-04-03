import java.util.ArrayList;
import java.util.List;

public class subSetInteger {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        subStr(nums, 0, ans, list);

        return list;

    }

    public static void subStr(int[] arr, int index, List<Integer> ans, List<List<Integer>> list) {

        if (arr.length == index) {
            list.add(new ArrayList<>(ans));
            //
            // ans=new ArrayList();
            return;
        }

        subStr(arr, index + 1, ans, list);
        ans.add(arr[index]);
        subStr(arr, index + 1, ans, list);
        ans.remove(ans.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // subsets(arr);

        System.out.println(subsets(arr));

    }
}
