package programmers괄호회전하기;

import java.util.Stack;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            int k = i;
            while (j < arr.length) {
                String letter = arr[k % arr.length];
                if (letter.equals("(") || letter.equals("[") || letter.equals("{")) {
                    stack.add(letter);
                } else {
                    if (stack.isEmpty()) {
                        answer--;
                        break;
                    }
                    if (letter.equals(")") && stack.peek().equals("(")) {
                        stack.pop();
                    } else if (letter.equals("]") && stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        if (stack.peek().equals("{")) {
                            stack.pop();
                        }
                    }
                }
                j++;
                k++;
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}