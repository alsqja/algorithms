package programmers예상대진표;

public class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        while (max - min != 1 || max % 2 != 0) {
            max = max % 2 == 0 ? max / 2 : max / 2 + 1;
            min = min % 2 == 0 ? min / 2 : min / 2 + 1;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(8, 4, 7));
    }
}
