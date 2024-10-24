package programmers2016년;

public class Solution {
    public String solution(int a, int b) {
        int day = 0;
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (a == 1) {
            day += b;
        } else {
            for (int i = 1; i < a; i++) {
                day += days[i - 1];
            }
            day += b;
        }

        return switch (day % 7) {
            case 1 -> "FRI";
            case 2 -> "SAT";
            case 3 -> "SUN";
            case 4 -> "MON";
            case 5 -> "TUE";
            case 6 -> "WED";
            default -> "THU";
        };
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(5, 24));
    }
}
