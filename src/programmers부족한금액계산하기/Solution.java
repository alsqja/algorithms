package programmers부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
        long answer = (long) money;
        for (int i = 1; i <= count; i++) {
            answer -= (long) price * i;
        }

        if (answer >= 0) {
            return 0;
        }
        return -answer;
    }
}
