package programmers석유시추;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {

    static int n, m;
    static int[] oil;

    public int solution(int[][] land) {

        n = land.length;
        m = land[0].length;
        oil = new int[m];

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    bfs(land, visited, i, j);
                }
            }
        }

        return Arrays.stream(oil).max().getAsInt();
    }

    private void bfs(int[][] land, boolean[][] visited, int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int count = 1;
        Set<Integer> set = new HashSet<>();
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            set.add(poll[1]);

            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];

                if (!checkPossible(nx, ny)) {
                    continue;
                }

                if (land[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    count++;
                }
            }
        }

        for (int i : set) {
            oil[i] += count;
        }
    }

    private boolean checkPossible( int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}
