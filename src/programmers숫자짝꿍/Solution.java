package programmers숫자짝꿍;

public class Solution {
    public String solution(String x, String y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (char c : x.toCharArray()) {
            xArr[Integer.parseInt(Character.toString(c))]++;
        }
        for (char c : y.toCharArray()) {
            yArr[Integer.parseInt(Character.toString(c))]++;
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            if (xArr[i] > 0 && yArr[i] > 0) {
                if (i == 0 && answer.toString().isEmpty()) {
                    return "0";
                }
                int min = Math.min(xArr[i], yArr[i]);
                answer.append(String.valueOf(i).repeat(min));
            }
        }

        if (answer.toString().isEmpty()) {
            return "-1";
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("5525", "1255"));
    }
}
