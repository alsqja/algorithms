package programmers옹알이2;

public class Solution {
    public int solution(String[] babblings) {

        int answer = 0;

        String[] words = new String[]{"aya", "ye", "woo", "ma"};

        for (String babbling : babblings) {
            if (babbling.contains("ayaaya") || babbling.contains("yeye") || babbling.contains("woowoo") || babbling.contains("mama")) {
                continue;
            }

            for (String word : words) {
                babbling = babbling.replaceAll(word, " ");
            }

            if (babbling.trim().isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}