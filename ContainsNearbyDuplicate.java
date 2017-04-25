package com.wrh.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsNearbyDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||k<1){
        	return false;
        }
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
        	if(hs.add(nums[i])==false){//����Ԫ���ظ���ʱ�򣬾Ͳ��ܷ���Set������
        		return true;
        	}
        	if(hs.size()==k+1){
        		hs.remove(nums[i-k]);//����ɾ����ʱhs�еĵ�һ��Ԫ�ء�
        	}
        }
		return false;
    }
	/*
	 * �������ܣ���������д��ڳ��������μ��������ϵ������򷵻�true�����򷵻�false
	 * */
	public static boolean containsDuplicate(int[] nums) {
        if(nums==null){
        	return false;
        }
        Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(set.add(nums[i])==false){
				return true;
			}
		}
		return false;
    }
	public static void main(String[] args){
		boolean flag=containsDuplicate(new int[]{3,1});
		System.out.println(flag);
	}
}
