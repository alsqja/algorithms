package programmers영어끝말잇기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0, 0};

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        set.add(words[0]);
        list.add(words[0]);
        int circle = 1;
        int index = 2;

        for (int i = 1; i < words.length; i++) {
            if (list.get(i - 1).charAt(list.get(i - 1).length() - 1) != words[i].charAt(0)) {
                answer[0] = index;
                answer[1] = circle;
                return answer;
            }
            if (set.contains(words[i])) {
                answer[0] = index;
                answer[1] = circle;
                return answer;
            }
            set.add(words[i]);
            list.add(words[i]);

            if (index == n) {
                circle++;
                index = 1;
            } else {
                index++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution.solution(3, words)));
    }
}
