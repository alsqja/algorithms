package programmers_같은숫자는싫어;

import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        Stack<Integer> answerList = new Stack<>();
        answerList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (answerList.peek() != arr[i]) {
                answerList.add(arr[i]);
            }
        }
        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
