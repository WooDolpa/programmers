package lv0.day02;

import java.util.stream.IntStream;

/**
 * packageName : lv0
 * className : EvenNumberSumTest
 * user : jwlee
 * date : 2022/11/18
 */
public class EvenNumberSumTest {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(0, 10).filter(i -> i % 2 == 0).sum());
    }

    /**
     * 짝수의 합
     *
     */
    public static class Solution {
        public int solution(int n) {
            boolean isValid = (0 < n && n <= 1000);
            int answer = 0;
            if(isValid) {
                int sum = 0;
                for (int i=1; i <= n; i++) {
                    if(i % 2 == 0) sum += i;
                }
                return sum;
            }
            return answer;
        }
    }

}
