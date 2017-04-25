package com.wrh.leetcode;

public class Solve {
	public void solve(char[][] board) {
        if(board==null){
        	return;
        }
        boolean[] isSurround=new boolean[4];//来表示某个点的周围4边是否被包围
        for(int i=0;i<4;i++){
        	isSurround[i]=false;
        }
        int row=board.length;
        int col=board[0].length;
        for(int i=1;i<row-1;i++){
        	
        	for(int j=1;j<col-1;j++){
        		if(board[i][j]=='O'){//开始检查这个点的四周
        			
        			
        		}
        	}
        }
    }
}
