package programmers바탕화면정리;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int minX = 100;
        for (String s : wallpaper) {
            if (minX > s.indexOf("#") && s.contains("#")) {
                minX = s.indexOf("#");
            }
        }
        answer[1] = minX;

        int maxX = 0;
        for (String s : wallpaper) {
            if (maxX < s.lastIndexOf("#") && s.contains("#")) {
                maxX = s.lastIndexOf("#");
            }
        }
        answer[3] = maxX + 1;

        int minY = 100;
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#") && minY > i) {
                minY = i;
            }
        }
        answer[0] = minY;

        int maxY = 0;
        for (int i = wallpaper.length - 1; i >= 0; i--) {
            if (wallpaper[i].contains("#") && maxY < i) {
                maxY = i;
            }
        }
        answer[2] = maxY + 1;

        return answer;
    }

    public static void main(String[] args) {
        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        System.out.println(Arrays.toString(new Solution().solution(wallpaper)));
    }
}
