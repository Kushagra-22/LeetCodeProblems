package com.LeetCodeEx;

class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MAX_VALUE;
        int profit=0;
        
       
        for (int i = 0; i < prices.length; i++) {
			if (prices[i]<max) {
				max=prices[i];
				
			}
			else if (prices[i]-max>profit) {
				 profit=prices[i]-max;
			}
		}
        return profit;
}
}
public class BuyAndSellStock {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution=new Solution();
		int []price= {7,1,5,3,6,4};
		int [] price2= {2,1,2,0,1};
		int profit=solution.maxProfit(price);
		System.out.println(profit);
		
		int profit2=solution.maxProfit(price2);
		System.out.println(profit2);

	}

}
