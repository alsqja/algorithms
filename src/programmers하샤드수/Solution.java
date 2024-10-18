package programmers하샤드수;

public class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int copyX = x;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return copyX % sum == 0;
    }
}
