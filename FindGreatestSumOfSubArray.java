package com.wrh.leetcode;

public class FindGreatestSumOfSubArray {
	
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length==0){
        	return 0;
        }
        int len = array.length;
        int curSum = array[0];
        int beginIndex = 0;
        int endIndex = 0;
        int finalSum = array[0];
        int resBeginIndex = 0;
        int resEndIndex = 0;
        for(int i=1;i<len;i++){
        	if(curSum<0){
        		curSum = array[i];
        		beginIndex = i;
        		endIndex = i;
        	}
        	else{
        		curSum+=array[i];
        		endIndex = i;
        	}
        	if(curSum>finalSum){
        		finalSum = curSum;
        		resBeginIndex  = beginIndex;
        		resEndIndex = endIndex;
        	}
        }
        return finalSum;
    }
    
    
}
