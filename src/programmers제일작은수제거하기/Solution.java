package programmers제일작은수제거하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }
        List<Integer> list = new ArrayList<>();

        int index = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] < min) {
                index = i;
                min = arr[i];
            }
        }
        list.remove(index);

        return list.stream().mapToInt(i -> i).toArray();
    }
}
