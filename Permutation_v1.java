package com.wrh.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Permutation_v1 {
	 // �������
    private static int  index=1;
    
    // ��������ظ���������Ϊ������2��Ӱ��
    private static Set<String> set=new HashSet<String>();
    
    public static void main(String[] args){
        Integer[] arr02={1,2,2,3,4,5};
        //Integer[] arr02={1,2,2};
        permutation(arr02,0,arr02.length);
    }
    
    /**
     * ���к���
     * 
     * ˵����
     * @param arr
     * @param start
     * @param end
     * ����ʱ�䣺2010-6-22 ����02:05:12
     * �޸�ʱ�䣺2010-6-22 ����02:05:12
     */
    public static void permutation(Integer[] arr,int start,int end){
        if(start<end+1){
            permutation(arr,start+1,end);
            
            for(int i=start+1;i<end;i++){
                Integer temp;
                
                temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                
                permutation(arr,start+1,end);
                
                temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
            }
        }
        else{
            print(arr);
        }
    }

    /**
     * ��ӡ����
     * 
     * ˵����
     * @param arr
     * ����ʱ�䣺2010-6-22 ����02:05:27
     * �޸�ʱ�䣺2010-6-22 ����02:05:27
     */
    private static void print(Integer[] arr){
        // "4"�����ڵ���λ
        if(arr[2]==4){
            return;
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        
        String word=sb.toString();
        
        // "3"��"5"��������
        if(word.contains("35") || word.contains("53")){
            return;
        }
        
        // ��ӡ
        if(set.contains(word)==false){
            System.out.println((index++)+" "+word);
            set.add(word);
        }
    }
}
