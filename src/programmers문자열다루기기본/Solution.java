package programmers문자열다루기기본;

import java.util.regex.Pattern;

public class Solution {

    private static final String NUMBER_REG = "^[0-9]*$";

    public boolean solution(String s) {
        if (!Pattern.matches(NUMBER_REG, s)) {
            return false;
        }
        return s.length() == 4 || s.length() == 6;
    }
}
