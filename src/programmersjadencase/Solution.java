package programmersjadencase;

public class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirstNumber = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(" ");
                isFirstNumber = true;
                continue;
            }
            if (isFirstNumber) {
                answer.append(String.valueOf(c).toUpperCase());
                isFirstNumber = false;
            } else {
                answer.append(String.valueOf(c).toLowerCase());
            }
        }

        return answer.toString();
    }
}
