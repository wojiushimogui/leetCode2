package com.wrh.leetcode;

public class Solution {
    
    public static void main(String []args){
    	Solution s=new Solution();
    	for(int i=1;i<10;i++){
    		String result=s.countAndSay(i);
        	System.out.println(result);
    	}
    	
    	
    }
    public String countAndSay(int n) {
        if(n<=0){
            return null;
        }
        String str="1";
        int count=0;
        for(int i=0;i<n-1;i++){
            int len=str.length();
            StringBuilder tempStr=new StringBuilder();
            count=1;
            for(int j=0;j<len-1;j++){            	    
                if(str.charAt(j)==str.charAt(j+1)){
                	count++;
                }
                else{//统计出来了连续的个数
                	
                	tempStr.append( Integer.toString(count)).append(str.charAt(j));
                	count=1;
                	
                }  
            }
            tempStr.append( Integer.toString(count)).append(str.charAt(len-1));
            str=tempStr.toString();
        }
     return str;   
    }
}
