package programmers프렌즈4블록;

public class Solution {
    public int solution(int m, int n, String[] board) {
        int[] dx = {0, 1, 1, 0};
        int[] dy = {0, 0, 1, 1};

        char[][] before = new char[m][n];
        char[][] after = new char[m][n];

        for (int i = 0; i < m; i++) {
            before[i] = board[i].toCharArray();
            after[i] = board[i].toCharArray();
        }

        int answer = 0;

        while (true) {
            boolean flag = true;
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {

                    int[][] visited = new int[4][2];

                    char initial = before[i][j];

                    int count = 0;

                    for (int k = 0; k < 4; k++) {
                        if (initial == before[i + dx[k]][j + dy[k]]) {
                            visited[k] = new int[]{i + dx[k], j + dy[k]};
                            count++;
                        }
                    }
                    if (count == 4) {
                        for (int[] a : visited) {
                            if (after[a[0]][a[1]] != '0') {
                                after[a[0]][a[1]] = '0';
                                answer++;
                                flag = false;
                            }
                        }
                    }
                }
            }

            if (flag) {
                break;
            }

            for (int i = 0; i < n; i++) {
                for (int j = m - 1; j >= 0; j--) {
                    if (after[j][i] == '0') {
                        for (int k = j - 1; k >= 0; k--) {
                            if (after[k][i] == '0') {
                                continue;
                            }
                            after[j][i] = after[k][i];
                            after[k][i] = '0';
                            break;
                        }
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    before[i][j] = after[i][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}));
    }
}