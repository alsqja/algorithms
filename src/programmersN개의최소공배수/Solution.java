package programmersN개의최소공배수;

public class Solution {
    public int solution(int[] arr) {
        int answer = lcm(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if (answer % arr[i] == 0) {
                continue;
            }
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    private int gdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gdc(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * b / gdc(a, b);
    }
}
