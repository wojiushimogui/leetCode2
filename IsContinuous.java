package com.wrh.leetcode;

import java.util.Arrays;

public class IsContinuous {
	
    public boolean isContinuous(int [] numbers) {
    	if(numbers==null||numbers.length==0){
    		return false;
    	}
    	Arrays.sort(numbers);//����
    	int len = numbers.length;
    	//ͳ����ĸ���
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
    		if(temp==0){//������ȵ���
    			return false;
    		}
    		else if(temp==1){//����
    			continue;
    		}
    		else if(temp>1){//��Ҫ��������
    			countZero-=(temp-1);
    			if(countZero<0){
    				return false;
    			}
    		}
    	}
    	return true;
    }
}
