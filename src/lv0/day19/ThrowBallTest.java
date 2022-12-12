package lv0.day19;

import java.util.Arrays;

/**
 * packageName : lv0.day19
 * className : ThrowBallTest
 * user : jwlee
 * date : 2022/12/11
 */
public class ThrowBallTest {
    public static void main(String[] args) {

    }

    /**
     * 공 던지기
     * answer = numbers[((1 + ((k-1)*2))%numbers.length) - 1];
     *
     */
    public static class Solution {
        public int solution(int[] numbers, int k) {
            int answer = 0;
            int numbersLen = numbers.length;
            int idx = ((k-1) * 2) % numbersLen;
            int[] nums = numbers;
            Arrays.sort(nums);
            answer = numbers[idx];
            return answer;
        }
    }
}
