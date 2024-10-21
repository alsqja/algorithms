package programmers없는숫자더하기;

public class Solution {
    public int solution(int[] numbers) {
        boolean[] arr = new boolean[10];
        int answer = 0;
        for (int i : numbers) {
            arr[i] = true;
        }
        for (int i = 0; i < 10; i++) {
            if (!arr[i]) {
                answer += i;
            }
        }
        return answer;
    }
}
