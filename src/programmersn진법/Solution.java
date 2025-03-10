package programmersn진법;

public class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String word = "";

        for (int i = 0; word.length() <= t * m; i++) {
            word += Integer.toString(i, n);
        }

        for (int i = 0; i < t; i++) {
            answer += word.charAt(i * m + p - 1);
        }
        return answer.toUpperCase();
    }
}
