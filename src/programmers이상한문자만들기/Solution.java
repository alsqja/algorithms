package programmers이상한문자만들기;

import java.util.StringTokenizer;

public class Solution {
    public String solution(String s) {
        StringTokenizer tokens = new StringTokenizer(s, " ", true);
        String answer = "";

        while (tokens.hasMoreElements()) {
            String token = tokens.nextToken();

            if (token.equals(" ")) {
                answer += " ";
                continue;
            }

            for (int i = 0; i < token.length(); i++) {
                if (i % 2 == 0) {
                    answer += Character.toUpperCase(token.charAt(i));
                } else {
                    answer += Character.toLowerCase(token.charAt(i));
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "  TRy HElLo  WORLD ";
        Solution sol = new Solution();

        System.out.println(sol.solution(str));
    }
}
