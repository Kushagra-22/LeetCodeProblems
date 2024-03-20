public class maxConsecutivesOnes {
    public static int longestOnes(int[] nums, int k) {
        int  flag = 0, cnt = 0;
        int i = 0, j = 0;
        for (; i < nums.length; i++) {
            if(nums[i]==0){
                flag++;
            }
            while(flag>k){
                if(nums[j]==0){
                    flag--;
                }
                j++;
            }
            cnt=Math.max(cnt,i-j+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
//        int[] arr = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
         int []arr={1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr, 2));
    }
}
