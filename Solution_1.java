package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1 {
	public List<List<Integer>> list=new ArrayList<List<Integer>> ();
	public List<Integer> l=new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>>  combination(int []candidates,int target,int start){
		if(candidates==null||candidates.length<1){
        	return null;
        }
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		for(int i=start;i<candidates.length;i++){
			if(candidates[i]<target){//将candidates[i]加入到所有其满足combination(candidates,target-candidates[i],i)的List中
				for(List<Integer> l:combination(candidates,target-candidates[i],i)){
					l.add(0, candidates[i]);
					result.add(l);
				}
				
			}
			else if(candidates[i]==target){
				List<Integer> tempList=new ArrayList();
				tempList.add(candidates[i]);
				result.add(tempList);
				//return result;
			}
			else{
				break;//如果当前值大于target时，后面的值一定也大于target，因此，退出循环即可。
			}
		}
		
		return result;
        
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates==null||candidates.length<1){
        	return null;
        }
        //第一步：对数组进行排序
        Arrays.sort(candidates);
        
		
		return combination(candidates,target,0);
    }

}
