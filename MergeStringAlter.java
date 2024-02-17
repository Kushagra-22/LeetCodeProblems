package com.LeetCodeEx;

import java.util.Iterator;

class Solution1{
public String mergeAlternately(String word1, String word2) {
        String word3="";
        int length=Integer.min(word1.length(), word2.length());
        
        for(int i=0;i<length;i++) {
        	word3+=word1.charAt(i)+""+word2.charAt(i);
//        	System.out.println(i);
        }
        if (length<word1.length()) {
			word3+=word1.substring(length);
		}
        else if (length<word2.length()) {
			word3+=word2.substring(length);
		}
        
        return word3;
	
	
    }
}
public class MergeStringAlter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 solution=new Solution1();
		String word1="abcd";
		String word2="pq";
		
		String word3=solution.mergeAlternately(word1, word2);
		System.out.println(word3);
	}

}
