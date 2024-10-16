public class Sort1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer;
        answer = new int[commands.length];
        int answer_count = 0;
        for (int[] command : commands) {
            int len = command[1] - command[0];
            int[] new_arr = new int[len + 1];
            for (int i = command[0]; i <= command[1]; i++) {
                new_arr[i - command[0]] = array[i - 1];
            }
            // 5,2,6,3
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                for (int j : new_arr) {
                    if (j == i) {
                        count++;
                    }
                    if (count == command[2]) {
                        answer[answer_count] = j;
                        answer_count++;
                        break;
                    }
                }
                if (count == command[2]) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };

        Sort1 sol = new Sort1();
        int[] answer = sol.solution(array, commands);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
