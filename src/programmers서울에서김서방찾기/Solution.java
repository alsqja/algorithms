package programmers서울에서김서방찾기;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public String solution(String[] seoul) {
        List<String> arr = Arrays.asList(seoul);
        int answer = arr.indexOf("Kim");
        return "김서방은 " + answer + "에 있다";
    }
}
