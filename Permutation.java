package com.wrh.leetcode;

public class Permutation {
	 // �������
    private static int  index=1;
    
    public static void main(String[] args){
        // ��������������ð���ʮ����ǧ���٣�ʮ����λ����
        int[] arr=new int[6];
        
        // ��������洢����ת���ɵ��ַ���
        String word;
        
        int j;
        // i�������г��������ֵ����Сֵ֮��ѭ��
        for(int i=122345;i<=543221;i++){
            // �õ�����ʮ����ǧ���٣�ʮ����λ����
            for(j=0;j<arr.length;j++){
                arr[j]=(i/(power(6-j))) % 10;
            }
            
            // 0��6-9�����ų�
            if(hasExtraNumber(arr)==true){
                continue;
            }
            
            // "4"�����ڵ���λ
            if(arr[2]==4){
                continue;
            }
            
            word=String.valueOf(i);
            
            // "3"��"5"��������
            if(word.contains("35") || word.contains("53")){
                continue;
            }
            
            // ֻ��2����������
            if(judge(arr)==false){
                continue;
            }
            
            // ��ӡ
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
     * ���Ƿ��в���1-5��Χ�ڵ�����
     * 
     * ˵����
     * @param arr
     * @return
     * ����ʱ�䣺2010-6-22 ����01:20:50
     * �޸�ʱ�䣺2010-6-22 ����01:20:50
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
     * ȡ10��n-1�η�
     * 
     * ˵����
     * @param n
     * @return
     * ����ʱ�䣺2010-6-22 ����01:16:35
     * �޸�ʱ�䣺2010-6-22 ����01:16:35
     */
    private static int power(int n){
        int retval=1;
        
        for(int i=0;i<n-1;i++){
            retval*=10;
        }
        
        return retval;
    }
}
