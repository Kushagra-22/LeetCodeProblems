
public class firstAndLastOcc{
        public static int upperBound(int []arr,int target){
            int s=0;
            int e=arr.length-1;
            int ans=arr.length;

            while(s<=e){
                int mid=e-((e-s)/2);
                if(arr[mid]>target){
                    ans=mid;
                    e=mid-1;
                }
                else 
                s=mid+1;
            }

            return ans;
        }

        public static int lowerBound(int []arr,int target){
            int s=0;
            int e=arr.length-1;
            int ans=arr.length;

            while(s<=e){
                int mid=e-((e-s)/2);
                if(arr[mid]>=target){
                    ans=mid;
                    e=mid-1;
                }
                
                else 
                s=mid+1;
            }

            return ans;
        }

        public static int[] searchRange(int[] nums,int target){
            int []ans={-1,-1};
            int first=lowerBound(nums, target);
            if(first==nums.length || nums[first]!=target){
                return ans;
            }
            ans[0]=first;
            ans[1]=upperBound(nums, target)-1;
            return ans;
        }

           
            
        
    public static void main(String[] args) {
        int []arr={1,3};
        arr=searchRange(arr,1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}