public class Programmers_지폐접기 {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int longWallet = Math.max(wallet[0], wallet[1]);
        int shortWallet = Math.min(wallet[0], wallet[1]);

        while(true) {
            int longBill = bill[0];
            int shortBill = bill[1];
            int longIdx = 0;
            int max = bill[0];

            if (bill[1] > bill[0]) {
                longBill = bill[1];
                shortBill = bill[0];
                longIdx = 1;
            }

            if (longWallet >= longBill && shortWallet >= shortBill) {
                break;
            }

            bill[longIdx] /= 2;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] wallet = {50, 50};
        int[] bill = {100, 241};
        Programmers_지폐접기 solution = new Programmers_지폐접기();
        int answer = solution.solution(wallet, bill);
        System.out.println(answer);
    }
}
