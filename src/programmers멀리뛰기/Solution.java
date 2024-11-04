package programmers멀리뛰기;

public class Solution {
    public long solution(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        long prev1 = 1L;
        long prev2 = 2L;
        long current = 1L;

        for (int i = 2; i < n; i++) {
            current = (prev1 + prev2) % 1234567;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }
}
