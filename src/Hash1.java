import java.util.HashMap;

class Hash1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String i : participant) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (String i : completion) {
            hm.put(i, hm.get(i) - 1);
        }

        for (String key: hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] part = {"a", "b", "c", "d"};
        String[] comp = {"a", "b", "d"};

        Hash1 sol = new Hash1();
        System.out.println(sol.solution(part, comp));
    }
}