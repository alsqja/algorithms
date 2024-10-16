package programmers정수내림차순으로배치하기;

public class Solution {
    public long solution(long n) {
        // 881233
        int[] arr = new int[10];
        String answer = "";

        while(n > 0) {
            int x = (int) (n % 10);
            arr[x]++;
            n /= 10;
        }

        for (int i = 9; i >= 0; i--) {
            while(arr[i] > 0) {
                answer += Integer.toString(i);
                arr[i]--;
            }
        }
        return Long.parseLong(answer);
    }
}
