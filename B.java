package com.wrh.leetcode;

class A {
    private int a = 0;
    private int b = 0;
    A(int a, int b) {
     //����aֱ�Ӵ�㸳ֵ������b���÷�����ֵ
        this.a = a;
        System.out.println(" "+a+" this.a="+this.a+"this.getname"+this.getClass().getName());
        this.setB(b);
        System.out.println("  "+this.b+this.getClass().getName()+" "+b);
    }
    public void setB(int b) {
    	System.out.println("AAAsetB");
        this.b = b;
    }
     
    public A showA() {
        System.out.println(this.a + "\t" + this.b);
        return this;
    }
}
 
class B extends A{
    B() {
        super(1, 1);
    }
    public int a = 2;
    public int b = 2;
     
    public B showB() {
    	System.out.println("11111111111");
        System.out.println(this.a + "\t" + this.b);
        return this;
    }
    //��д��set����
    public void setB(int b) {
    	System.out.println("22222222222222");
        this.b = b;
        System.out.println("  "+this.b+this.getClass().getName());
    }
    public static void main(String []args){
    	new B().showB().showA();
    }
}
/*
 * �²���Ϊ��2	2
 * 		   2    2
 * */
