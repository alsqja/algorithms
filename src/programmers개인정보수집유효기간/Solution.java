package programmers개인정보수집유효기간;

import java.util.*;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();

        for (String term : terms) {
            String[] arr = term.split(" ");
            map.put(term.charAt(0), Integer.parseInt(String.valueOf(arr[1])));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");

            if (!checkDate(arr[0], today, map.get(arr[1].charAt(0)))) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public boolean checkDate(String date, String today, int privacy) {
        int[] dateArr = Arrays.stream(date.split("\\.")).mapToInt(Integer::parseInt).toArray();
        int[] todayArr = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();

        int[] pArr = {privacy / 12, privacy % 12};

        dateArr[0] += pArr[0];

        if (dateArr[1] > 12 - pArr[1]) {
            dateArr[0]++;
            dateArr[1] = dateArr[1] + pArr[1] - 12;
        } else {
            dateArr[1] += pArr[1];
        }

        System.out.println(Arrays.toString(todayArr));
        System.out.println(Arrays.toString(dateArr));

        if (todayArr[0] > dateArr[0]) {
            return false;
        }
        if (todayArr[0] == dateArr[0]) {
            if (todayArr[1] > dateArr[1]) {
                return false;
            }
            if (todayArr[1] == dateArr[1]) {
                return todayArr[2] < dateArr[2];
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkDate("2022.02.19", "2022.05.19", 3));
    }
}
