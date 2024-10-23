package programmers문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String answer = "";

        for (String i : arr) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("Zbcdefg"));
    }
}
