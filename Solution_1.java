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
			if(candidates[i]<target){//��candidates[i]���뵽����������combination(candidates,target-candidates[i],i)��List��
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
				break;//�����ǰֵ����targetʱ�������ֵһ��Ҳ����target����ˣ��˳�ѭ�����ɡ�
			}
		}
		
		return result;
        
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates==null||candidates.length<1){
        	return null;
        }
        //��һ�����������������
        Arrays.sort(candidates);
        
		
		return combination(candidates,target,0);
    }

}
