package programmers공원;

public class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        for (int mat : mats) {
            for (int i = 0; i < park[0].length; i++) {
                if (mat + i > park[0].length) {
                    break;
                }
                for (int j = 0; j < park.length; j++) {
                    if (mat + j > park.length) {
                        break;
                    }
                    if (this.checkArea(park, mat, i, j) && answer < mat) {
                        answer = mat;
                    }
                }
            }
        }
        return answer;
    }

    public boolean checkArea(String[][] park, int length, int x, int y) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (park[i + y][j + x].equals("-1")) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] park = {{"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};
        int[] mats = {5,3,2};

        int answer = solution.solution(mats, park);
        System.out.println(answer);
    }
}
