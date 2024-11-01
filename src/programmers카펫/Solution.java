package programmers카펫;

public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int outLine = (brown + 4) / 2;
        for (int i = 3; i <= outLine; i++) {
            if (i * (outLine - i) - brown == yellow) {
                answer[0] = Math.max(i, outLine - i);
                answer[1] = Math.min(i, outLine - i);
            }
        }
        return answer;
    }
}
