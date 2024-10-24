package programmers콜라문제;

public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += n / a * b;
            n = (n % a) + (n / a * b);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3, 1, 20));
    }
}
