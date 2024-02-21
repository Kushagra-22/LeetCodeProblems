package com.LeetCodeEx;

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	List<Boolean> candiesBooleans=new ArrayList<Boolean>();

        for(int i=0;i<candies.length;i++){
            
            candiesBooleans.add(checkMax(candies,candies[i]+extraCandies));
            	

        

        }
        return candiesBooleans;
        
    }

    public boolean checkMax(int [] candies,int candy){
    	boolean b=true;
        for (int i = 0; i < candies.length; i++) {
			if (candies[i]>candy) {
				b=false;
				
			}
		}
        return b;
    }
}

/*
 class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = -1;
        for(int elem: candies){
            if(elem>maxCandies){
                maxCandies = elem;
            }
        }
        List<Boolean> list = new ArrayList<>(candies.length);
        for(int elem: candies){
            if(elem+extraCandies>=maxCandies){
                list.add(true);
            } else{
                list.add(false);
            }
        }
        return list;
    }
}
 */
public class Kids_max_candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []candies= {4,2,1,1,2};
		Solution2 solution2=new Solution2();
		System.out.println(solution2.kidsWithCandies(candies, 1));

	}

}
