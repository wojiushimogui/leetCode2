package com.wrh.leetcode;

import java.util.Set;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> wordDict) {
        int len=s.length();
        for(int i=1;i<=len;i++){
        	String temp=s.substring(0, i);
        	if(wordDict.contains(temp)){
        		if(s.substring(i).isEmpty()){//¼´µ±i=lenÊ±
        			return true;
        		}
        		else{
        			return wordBreak(s.substring(i),wordDict);
        		}
        		
        	}
        }
		return false;
    }
}
