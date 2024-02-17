package com.LeetCodeEx;

import java.util.ArrayList;
import java.util.List;

public class permutations {
	
	
	public static void permutation(int index,int []arr,List<List<Integer>> ans) {
		
// [1,2,3]
	
		if(index==arr.length) {
			List<Integer> ds=new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				ds.add(arr[i]);
			}
			ans.add(ds);
		}
		
		for (int i = index; i < arr.length; i++) {
			swap(i, index, arr);
			permutation(index+1, arr, ans);
			swap(i,index,arr);
		}
	}
	
/*
  private void helper(int pos, int[] nums, List<List<Integer>> ans) {
        if (pos == nums.length) {
            // Come at the end of the branch.
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            ans.add(permutation);
            return;
        }
 */
	
	public static void swap(int i,int j,int []arr) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	
	public static List<List<Integer>> per(int []arr){
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		permutation(0,arr,ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3};
		System.out.println(per(a));

	}

}
