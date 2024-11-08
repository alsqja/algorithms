package programmershindex;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        citations = Arrays.stream(citations).sorted().toArray();
        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations.length - i <= citations[i]) {
                answer = citations.length - i;
                break;
            }
        }
        return answer;
    }
}
