package Programmers_공원산책;

public class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        for (String route: routes) {
            answer = this.checkPass(park, route, answer);
        }
        return answer;
    }

    int[] checkPass(String[] park, String route, int[] start) {
        int[] answer = new int[2];
        String direction = route.split(" ")[0];
        int len = Integer.parseInt(route.split(" ")[1]);

        switch (direction) {
            case "E": {
                if (park[start[0]].length() <= start[1] + len) {
                    return start;
                }
                for (int i = 1; i <= len; i++) {
                    if (park[start[0]].charAt(start[1] + i) == 'X') {
                        return start;
                    }
                }
                answer[0] = start[0];
                answer[1] = start[1] + len;
                return answer;
            }
            case "N": {
                if (start[0] - len < 0) {
                    return start;
                }
                for (int i = 1; i <= len; i++) {
                    if (park[start[0]-i].charAt(start[1]) == 'X') {
                        return start;
                    }
                }
                answer[0] = start[0] - len;
                answer[1] = start[1];
                return answer;
            }
            case "W": {
                if (start[1] - len < 0) {
                    return start;
                }
                for (int i = 1; i <= len; i++) {
                    if (park[start[0]].charAt(start[1] - i) == 'X') {
                        return start;
                    }
                }
                answer[0] = start[0];
                answer[1] = start[1] - len;
                return answer;
            }
            case "S": {
                if (start[0] + len >= park.length) {
                    return start;
                }
                for (int i = 1; i <= len; i++) {
                    if (park[start[0] + i].charAt(start[1]) == 'X') {
                        return start;
                    }
                }
                answer[0] = start[0] + len;
                answer[1] = start[1];
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        Solution solution = new Solution();
        int[] answer = solution.solution(park, routes);

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
