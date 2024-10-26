package programmers기사단원의무기;

public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println(countPrime(i, limit, power));
            answer += countPrime(i, limit, power);
        }
        return answer;
    }

    int countPrime(int number, int limit, int power) {
        int count = 0;
        if (number == 1) {
            return 1;
        }
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (i == Math.sqrt(number)) {
                    count++;
                } else {
                    count += 2;
                }
                if (count > limit) {
                    return power;
                }
            }
        }
        return count;
    }
}
