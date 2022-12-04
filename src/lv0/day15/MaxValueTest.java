package lv0.day15;

import java.util.Arrays;

/**
 * packageName : lv0.day15
 * className : MaxValueTest
 * user : jwlee
 * date : 2022/12/03
 */

public class MaxValueTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,-3,4,-5}));
    }

    /**
     * 최댓값 만들기(2)
     *
     */
    public static class Solution{
        public int solution(int[] numbers) {
            boolean isValid = (2 <= numbers.length && numbers.length <= 100);
            int answer = 0;
            if(isValid) {
                Arrays.sort(numbers);
                int a = numbers[0] * numbers[1];
                int b = numbers[numbers.length-1] * numbers[numbers.length-2];
                answer = a;
                if(a < b) {
                    answer = b;
                }
            }
            return answer;
        }
    }
}
