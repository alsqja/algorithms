package programmers모음사전;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> list = new ArrayList<>();

    public int solution(String word) {
        int answer = 0;

        dfs("");

        return list.indexOf(word);
    }

    private void dfs(String str) {
        String[] words = {"A", "E", "I", "O", "U"};
        list.add(str);
        if (str.length() == 5) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            dfs(str + words[i]);
        }
    }
}
