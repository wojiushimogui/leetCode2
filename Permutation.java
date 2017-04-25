package com.wrh.leetcode;

public class Permutation {
	 // 用于序号
    private static int  index=1;
    
    public static void main(String[] args){
        // 这个数组用来放置百万，十万，万，千，百，十，个位数字
        int[] arr=new int[6];
        
        // 这个用来存储数字转化成的字符串
        String word;
        
        int j;
        // i在能排列出来的最大值和最小值之间循环
        for(int i=122345;i<=543221;i++){
            // 得到百万，十万，万，千，百，十，个位数字
            for(j=0;j<arr.length;j++){
                arr[j]=(i/(power(6-j))) % 10;
            }
            
            // 0，6-9都被排除
            if(hasExtraNumber(arr)==true){
                continue;
            }
            
            // "4"不能在第三位
            if(arr[2]==4){
                continue;
            }
            
            word=String.valueOf(i);
            
            // "3"与"5"不能相连
            if(word.contains("35") || word.contains("53")){
                continue;
            }
            
            // 只有2可以连两次
            if(judge(arr)==false){
                continue;
            }
            
            // 打印
            System.out.println((index++)+" "+word);
            //System.out.println(i+"  "+arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]);
        }
    }
    
    private static boolean judge(int[] arr){
        int n1=0,n2=0,n3=0,n4=0,n5=0;
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]==1){
                n1++;
            }
            
            if(arr[j]==2){
                n2++;
            }
            
            if(arr[j]==3){
                n3++;
            }
            
            if(arr[j]==4){
                n4++;
            }
            
            if(arr[j]==5){
                n5++;
            }
        }
        
        return n1==1 && n2==2 && n3==1 && n4==1 && n5==1;
    }
    
    /**
     * 看是否有不在1-5范围内的数字
     * 
     * 说明：
     * @param arr
     * @return
     * 创建时间：2010-6-22 上午01:20:50
     * 修改时间：2010-6-22 上午01:20:50
     */
    private static boolean hasExtraNumber(int[] arr){
        for(int j=0;j<arr.length;j++){
            if(arr[j]<1 || arr[j]>5){
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * 取10的n-1次方
     * 
     * 说明：
     * @param n
     * @return
     * 创建时间：2010-6-22 上午01:16:35
     * 修改时间：2010-6-22 上午01:16:35
     */
    private static int power(int n){
        int retval=1;
        
        for(int i=0;i<n-1;i++){
            retval*=10;
        }
        
        return retval;
    }
}
