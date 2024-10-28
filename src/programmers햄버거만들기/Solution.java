package programmers햄버거만들기;

import java.util.Stack;

public class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            int len = stack.size();
            if (len >= 4) {
                boolean isBugger = stack.peek() == 1 && stack.get(len - 2) == 3 && stack.get(len - 3) == 2 && stack.get(len - 4) == 1;
                if (isBugger) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
}
