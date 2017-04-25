package com.wrh.leetcode;
/*
 * ��һ���������������ɾ���ظ������Ҳ��ܿ����κζ���Ŀռ�
 * /** 
 *  
 * Remove Duplicates from Sorted Array 
 *   
 * Given a sorted array, remove the duplicates in place such that each element appear 
 * only once and return the new length. 
 *  
 * Do not allocate extra space for another array, you must do this in place with 
 * constant memory. 
 *  
 * For example, Given input array A = [1,1,2], 
 *  
 * Your function should return length = 2, and A is now [1,2]. 
 *  
 */ 

public class S1 {

	public static void main(String[] args) {
		int []arr={1,1,2};
		int len=removeDuplicate(arr);
	}
	/*
	 * @param arr:a sorted array
	 * return the array new length
	 * */
	private static int removeDuplicate(int[] arr) {
		if(arr==null){
			return -1;
		}
		//��ǰ������ָ��������ɾ��������
		int index1=1;
		int index2=0;
		while(index1<arr.length){
			if(arr[index1]==arr[index2]){
				index1++;
			}
		}
		return 0;
	}

}
