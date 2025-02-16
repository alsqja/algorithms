package programmers데이터분석;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int extIndex = switch (ext) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> -1;
        };

        int sortIndex = switch (sort_by) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> -1;
        };

        List<int[]> list = new ArrayList<>();
        for (int[] datum : data) {
            if (datum[extIndex] < val_ext) {
                list.add(datum);
            }
        }

        list.sort(Comparator.comparing(a -> a[sortIndex]));

        return list.toArray(new int[list.size()][]);
    }
}
