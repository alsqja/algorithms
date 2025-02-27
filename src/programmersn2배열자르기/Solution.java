package programmersn2배열자르기;

public class Solution {
    public int[] solution(int n, long left, long right) {

        int[] answer = new int[(int) (right - left) + 1];
        for (int i = 0; i < right - left + 1; i++) {
            int row = (int) ((left + i) / n) + 1;
            int col = (int) ((left + i) % n) + 1;
            answer[i] = Math.max(col, row);
        }

        return answer;
    }
}
