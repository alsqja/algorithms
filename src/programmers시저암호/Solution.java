package programmers시저암호;

public class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += " ";
                continue;
            }
            char letter = (char) (s.charAt(i) + n);
            if (s.charAt(i) < 91 && letter >= 91 || s.charAt(i) < 123 && letter >= 123) {
                letter = (char) ((int) letter - 26);
            }
            answer += Character.toString(letter);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("a Z z", 4));
    }
}

