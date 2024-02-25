public class uppBound{
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
    public static void main(String[] args) {
        int []arr={5,5};
        int []arr1={1,3,5,6};
        System.out.println(lowerBound(arr1, 5));
        System.out.println(upperBound(arr, 5));
        System.out.println(lowerBound(arr, 5));


        
    }
}