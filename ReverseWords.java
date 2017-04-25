package com.wrh.leetcode;

public class ReverseWords {
	public String reverseWords(String s) {
        if(s==null||s.isEmpty()){
        	return s;
        }    
        s=s.trim();
        String[] str=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=str.length-1;i>=0;i--){
        	if(str[i].isEmpty()){
        		continue;
        	}
        	if(i==0){
        		sb.append(str[i].trim());
        	}
        	else{
        		sb.append(str[i].trim()).append(" ");
        	}
        	
        }
		return sb.toString();
    }

	
}
