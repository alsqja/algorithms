package programmers압축;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();

        List<String> list = new ArrayList<>();
        for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
            list.add((char) i + "");
        }

        int point = 0;
        while (point < msg.length()) {

            for (int j = list.size() - 1; j >= 0; j--) {
                String word = list.get(j);
                if (msg.substring(point).startsWith(word)) {
                    answer.add(j + 1);
                    point += word.length();
                    if (point < msg.length()) {
                        list.add(word + msg.charAt(point));
                    }
                    break;
                }
            }

        }

        int[] answers = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            answers[i] = answer.get(i);
        }

        return answers;
    }
}
