import java.util.*;

public class sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> set2 = new ArrayList<>();
//        List<List> set2 = new ArrayList<>();
        for (int x : nums) {
//        System.out.print(x+" ");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int s = i + 1;
            int e = nums.length - 1;

            while (s < e) {
                int sum = nums[s] + nums[e];
                List<Integer> list = new ArrayList<>();
                if (sum == -nums[i]) {
                    list.add(nums[i]);
                    list.add(nums[s]);
                    list.add(nums[e]);
                    set2.add(list);
                    s++;
                    e--;

                    while ( s<e && nums[s] == nums[s - 1]){
                        System.out.println(s);
                        s++;
                    }
                    while (s < e && nums[s] == nums[e + 1]){
                        e--;
                    }

                } else if (sum > -nums[i]) {
                    e--;
                } else {
                    s++;
                }

            }


        }
        return set2;
    }
    public static void main(String[] args) {
        sum3 sum = new sum3();
        int[] arr = {1,-1,-1,0};
        System.out.println(sum.threeSum(arr));
    }

}

