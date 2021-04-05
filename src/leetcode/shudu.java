package leetcode;

import java.util.ArrayList;
import java.util.List;

public class shudu {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        Solution1 solution = new Solution1();
        printBoard(board);
        solution.solveSudoku(board);
        printBoard(board);

    }
    private static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Solution1 {
    boolean success = false;
    boolean[][] line = new boolean[9][9];
    boolean[][] col = new boolean[9][9];
    boolean[][][] box = new boolean[3][3][9];
    //表示三个[3][9]数组
    List<int[]> list = new ArrayList<>();
    public void solveSudoku(char[][] board) {

        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]=='.'){
                    list.add(new int[]{i,j});
                }else{
                    int num = board[i][j]-'0'-1;
                    line[i][num] = col[j][num] = box[i/3][j/3][num] = true;
                }
            }
        }
        dfs(board,0);
    }
    public void dfs(char[][] board,int index){
        if(index == list.size()){
            success = true;
            return;
        }
        int i = list.get(index)[0];
        int j = list.get(index)[1];
        for(int num = 0;num<9&&!success;num++){
            if(! line[i][num] &&!col[j][num]&&!box[i/3][j/3][num]){
                line[i][num] = col[j][num] = box[i/3][j/3][num] = true;
                board[i][j] = (char)(num+'0'+1);
                dfs(board,index+1);
                line[i][num] = col[j][num] = box[i/3][j/3][num] = false;
            }
        }
    }
}