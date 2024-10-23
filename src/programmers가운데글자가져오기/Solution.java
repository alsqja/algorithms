package programmers가운데글자가져오기;

public class Solution {
    public String solution(String s) {
        if (s.length() % 2 != 0) {
            return Character.toString(s.charAt(s.length() / 2));
        }
        return Character.toString(s.charAt(s.length() / 2 - 1)) + Character.toString(s.charAt(s.length() / 2));
    }
}
