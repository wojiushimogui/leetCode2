package com.wrh.leetcode;

public class Test_1 implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(new Test_1());
		t.start();
		System.out.println("hao");
		t.join();
		System.out.println("haohao");
	}

	@Override
	public void run() {
		System.out.println("wu");
		System.out.println("rang");
	}

}
