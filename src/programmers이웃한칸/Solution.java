package programmers이웃한칸;

public class Solution {
    public int solution(String[][] board, int h, int w) {

        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int x = h + dh[i];
            int y = w + dw[i];

            if (x >= 0 && x < board.length && y >= 0 && y < board[0].length) {
                if (board[x][y].equals(board[h][w])) {
                    count++;
                }
            }
        }

        return count;
    }
}
