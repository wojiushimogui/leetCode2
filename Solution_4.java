package com.wrh.leetcode;

public class Solution_4 {
		//���ÿո�String���в�֣�Ȼ�������һ���ַ��Ӵ��ĳ��ȼ���
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
