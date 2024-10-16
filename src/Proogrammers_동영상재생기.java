import java.util.Objects;

public class Proogrammers_동영상재생기 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer_m;
        String answer_s;
        int m = Integer.parseInt(pos.substring(0, 2));
        int s = Integer.parseInt(pos.substring(3));
        int start_m = Integer.parseInt(op_start.substring(0, 2));
        int start_s = Integer.parseInt(op_start.substring(3));
        int end_m = Integer.parseInt(op_end.substring(0, 2));
        int end_s = Integer.parseInt(op_end.substring(3));
        int maxM = Integer.parseInt(video_len.substring(0, 2));
        int maxS = Integer.parseInt(video_len.substring(3));

        for (String command : commands) {
            if (((m <= end_m && s <= end_s) || (s >= end_s && m < end_m)) && ((m >= start_m && s >= start_s) || (s < start_s && m > start_m))) {
                m = end_m;
                s = end_s;
            }
            int[] calc;
            if (Objects.equals(command, "next")) {
                calc = timeCalc(m, s, 10, maxM, maxS);
            } else {
                calc = timeCalc(m, s, -10, maxM, maxS);
            }
            m = calc[0];
            s = calc[1];
            if (((m <= end_m && s <= end_s) || (s >= end_s && m < end_m)) && ((m >= start_m && s >= start_s) || (s < start_s && m > start_m))) {
                m = end_m;
                s = end_s;
            }
        }
        answer_m = m >= 10 ? String.valueOf(m) : "0" + m;
        answer_s = s >= 10 ? String.valueOf(s) : "0" + s;
        return answer_m + ":" + answer_s;
    }

    public int[] timeCalc(int m, int s, int gap, int maxM, int maxS) {
        if (gap < 0) {
            if (s < 10) {
                if (m == 0) {
                    s = 0;
                } else {
                    s = s + 50;
                    m = m - 1;
                }
            } else {
                s = s - 10;
            }
        } else {
            if (s > 50) {
                s = s + 10 - 60;
                if (m < maxM && s <= maxS) {
                    m++;
                } else if (m < maxM) {
                    s = maxS;
                    m++;
                } else if (m == maxM && s > maxS) {
                    s = maxS;
                }
            } else {
                s += 10;
                if (s > maxS && m == maxM) {
                    s = maxS;
                }
            }
        }
        return new int[]{m, s};
    }

    public static void main(String[] args) {
        String video_len = "30:00";
        String pos = "29:55";
        String op_start = "01:00";
        String op_end = "01:30";
        String[] commands = {"next"};

        Proogrammers_동영상재생기 sol = new Proogrammers_동영상재생기();
        String answer = sol.solution(video_len, pos, op_start, op_end, commands);
        System.out.println(answer);
    }
}
