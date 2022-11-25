package lv0.day07;

import java.util.Arrays;

/**
 * packageName : lv0.day07
 * className : ArraySliceTest
 * user : jwlee
 * date : 2022/11/24
 */
public class ArraySliceTest {
    public static void main(String[] args) {}

    /**
     * 배열 자르기
     *
     */
    public static class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            boolean isValidLen = (2 <= numbers.length && numbers.length <= 30);
            boolean isValid = (0 <= num1 && num1 < num2 && num2 < numbers.length) && isValidLen;
            int[] answer = {};
            if(isValid) {
                answer = Arrays.stream(numbers).filter(i -> (0 <= i && i <= 1000)).toArray();
                return Arrays.copyOfRange(answer, num1, (num2+1));
            }
            return answer;
        }
    }
}
