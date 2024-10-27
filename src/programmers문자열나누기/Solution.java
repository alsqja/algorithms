package programmers문자열나누기;

public class Solution {
    public int solution(String s) {
        int xCount = 0;
        int count = 0;
        int answer = 0;

        char x = 0;
        boolean first = true;
        for (char c : s.toCharArray()) {
            if (first) {
                x = c;
                xCount++;
            }
            if (c == x && !first) {
                xCount++;
            } else if (c != x) {
                count++;
                if (count == xCount) {
                    first = true;
                    answer++;
                    xCount = 0;
                    count = 0;
                    continue;
                }
            }
            first = false;
        }
        if (xCount > 0) {
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("abracadabra"));
    }
}
