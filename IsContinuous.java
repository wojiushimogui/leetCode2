package com.wrh.leetcode;

import java.util.Arrays;

public class IsContinuous {
	
    public boolean isContinuous(int [] numbers) {
    	if(numbers==null||numbers.length==0){
    		return false;
    	}
    	Arrays.sort(numbers);//排序
    	int len = numbers.length;
    	//统计零的个数
    	int countZero = 0;
    	int nonZeroIndex = 0;
    	for(int i=0;i<len;i++){
    		if(numbers[i]==0){
    			countZero++;
    		}
    		else{
    			nonZeroIndex = i;
    			break;
    		}
    	}
    	int sum = 0;
    	for(int i=nonZeroIndex;i<len-1;i++){
    		int temp=(numbers[i+1]-numbers[i]);
    		if(temp==0){//存在相等的数
    			return false;
    		}
    		else if(temp==1){//正常
    			continue;
    		}
    		else if(temp>1){//需要用零来补
    			countZero-=(temp-1);
    			if(countZero<0){
    				return false;
    			}
    		}
    	}
    	return true;
    }
}
