import java.util.HashMap;

public class Programmers_달리기경주 {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        String[] answer = new String[players.length];

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
            map2.put(i, players[i]);
        }

        for (String call : callings) {
            int rank = map.get(call);
            String front = map2.get(rank - 1);

            map.replace(call, rank - 1);
            map.replace(front, rank);
            map2.replace(rank, front);
            map2.replace(rank - 1, call);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = map2.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Programmers_달리기경주 sol = new Programmers_달리기경주();
        String[] answer = sol.solution(players, callings);
        for (String a : answer) {
            System.out.println(a);
        }
    }
}
