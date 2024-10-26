package programmers덧칠하기;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n];

        for (int s : section) {
            arr[s - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                for (int j = i; j < i + m; j++) {
                    if (j < n) {
                        arr[j] = 0;
                    }
                }
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(8, 4, new int[]{2, 3, 6}));
    }
}
