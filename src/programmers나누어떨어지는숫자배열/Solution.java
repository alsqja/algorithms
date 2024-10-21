package programmers나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> listArr = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                listArr.add(i);
            }
        }
        if (listArr.isEmpty()) {
            return new int[] {-1};
        }
        Collections.sort(listArr);
        int[] answer = new int[listArr.size()];
        for (int i = 0; i < listArr.size(); i++) {
            answer[i] = listArr.get(i);
        }
        return answer;
    }
}
