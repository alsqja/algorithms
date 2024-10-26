package programmers로또의최고순위와최저순위;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int max = 0;
        int min = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                max++;
                continue;
            }
            for (int num : win_nums) {
                if (num == lotto) {
                    max++;
                    min++;
                    break;
                }
            }
        }
        int[] answer = {0, 0};

        switch (max) {
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            default:
                answer[0] = 6;
                break;
        }
        switch (min) {
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            default:
                answer[1] = 6;
                break;
        }
        return answer;
    }
}
