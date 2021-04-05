package leetcode;

public class TestShudu {
    public static void main(String[] args) {
        String[][] b = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}
};
        System.out.println(isValidSudoku1(b));
    }
    public static boolean isValidSudoku1(String[][] board) {
        //char[][] a = new char[9][9];
        int[][] rows = new int[9][9];
        int[][] col = new int[9][9];
        int[][] sbox = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!board[i][j].equals(".")){
                    int num = Integer.parseInt(board[i][j]) - 1;
                    int index_box = (i/3)*3+j/3;
                    if (rows[i][num]==1) { return false;}
                    else { rows[i][num]=1; }
                    if (col[j][num]==1) { return false;}
                    else { col[j][num]=1; }
                    if (sbox[index_box][num]==1)  { return false;}
                    else { sbox[index_box][num]=1; }
                }
            }
        }
        return true;

    }
    public static boolean isValidSudoku2(String[][] board) {
        //char[][] a = new char[9][9];
        int[][] rows = new int[9][9];
        int[][] col = new int[9][9];
        int[][] sbox = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!board[i][j].equals(".")){
                    int num = Integer.parseInt(board[i][j]) - 1;
                    int index_box = (i/3)*3+j/3;
                    if (rows[i][num]==1) { return false;}
                    else { rows[i][num]=1; }
                    if (col[j][num]==1) { return false;}
                    else { col[j][num]=1; }
                    if (sbox[index_box][num]==1)  { return false;}
                    else { sbox[index_box][num]=1; }
                }
            }
        }
        return true;

    }
}
