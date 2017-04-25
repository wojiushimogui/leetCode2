package com.wrh.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Permutation_v1 {
	 // 用于序号
    private static int  index=1;
    
    // 用于清除重复的数，因为有两个2的影响
    private static Set<String> set=new HashSet<String>();
    
    public static void main(String[] args){
        Integer[] arr02={1,2,2,3,4,5};
        //Integer[] arr02={1,2,2};
        permutation(arr02,0,arr02.length);
    }
    
    /**
     * 排列函数
     * 
     * 说明：
     * @param arr
     * @param start
     * @param end
     * 创建时间：2010-6-22 上午02:05:12
     * 修改时间：2010-6-22 上午02:05:12
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
     * 打印函数
     * 
     * 说明：
     * @param arr
     * 创建时间：2010-6-22 上午02:05:27
     * 修改时间：2010-6-22 上午02:05:27
     */
    private static void print(Integer[] arr){
        // "4"不能在第三位
        if(arr[2]==4){
            return;
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        
        String word=sb.toString();
        
        // "3"与"5"不能相连
        if(word.contains("35") || word.contains("53")){
            return;
        }
        
        // 打印
        if(set.contains(word)==false){
            System.out.println((index++)+" "+word);
            set.add(word);
        }
    }
}
