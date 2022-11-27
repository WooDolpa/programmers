package lv0.day08;

import java.util.stream.IntStream;

/**
 * packageName : lv0.day08
 * className : EvenHateTest
 * user : jwlee
 * date : 2022/11/27
 */
public class EvenHateTest {

    public static void main(String[] args) {

    }

    /**
     * 짝수는 싫어요
     *
     */
    public static class Solution {
        public int[] solution(int n) {
            boolean isLen = (1 <= n && n <= 100);
            int[] answer = {};
            if(isLen) {
                return IntStream.rangeClosed(0, n).filter(i -> (i % 2 != 0)).toArray();
            }
            return answer;
        }
    }
}
