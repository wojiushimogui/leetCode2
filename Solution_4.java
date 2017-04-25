package com.wrh.leetcode;

public class Solution_4 {
		//利用空格将String进行拆分，然后检查最后一个字符子串的长度即可
	    public int lengthOfLastWord(String s) {
	        if(s==null){
	        	return 0;
	        }
	        String []arrStr=s.split(" ");
	        System.out.println(arrStr.length);
	       // System.out.println(arrStr[arrStr.length-1]);
	    	return arrStr[arrStr.length-1].length();
	    }
	    public static void main(String[] args){
	    	Solution_4 so=new Solution_4();
	    	String s="   ";
	    	System.out.println(so.lengthOfLastWord(s)+"  ");;
	    }
	
}
