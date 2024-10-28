package programmers둘만의암호;

public class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (char c : s.toCharArray()) {
            for (int i = index; i > 0; i--) {
                c++;
                if (c > 122) c -= 26;

                while (skip.contains(String.valueOf(c))) {
                    c++;
                    if (c > 122) c -= 26;
                }
            }
            answer += c;
        }
        return answer;
    }
}

