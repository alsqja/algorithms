package programmers이진변환반복하기;

public class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        StringBuilder str = new StringBuilder(s);

        while (!str.toString().equals("1")) {
            int len = 0;
            for (char c : str.toString().toCharArray()) {
                if (c == '0') {
                    answer[1]++;
                } else {
                    len++;
                }
            }
            str = new StringBuilder();

            while (len > 0) {
                str.append(len % 2);
                len /= 2;
            }
            answer[0]++;
        }
        return answer;
    }
}
