package programmers핸드폰번호가리기;

public class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length() - 4;
        String numbers = phone_number.substring(len);
        String answer = "";
        for (int i = 0; i < len; i++) {
            answer += "*";
        }
        return answer + numbers;
    }
}
