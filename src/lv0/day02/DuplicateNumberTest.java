package lv0.day02;

import java.util.Arrays;

/**
 * packageName : lv0
 * className : DuplicateNumberTest
 * user : jwlee
 * date : 2022/11/20
 */
public class DuplicateNumberTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(solution.solution(new int[]{0, 2, 3, 4}, 1));
    }

    /**
     * 중복된 숫자 개수
     *
     */
    public static class Solution {
        public int solution(int[] array, int n) {
            boolean isValid = (1 <= array.length && array.length <= 100) && (0 <= n && n <= 1000);
            int answer = 0;
            if(isValid) {
                return (int) Arrays.stream(array).filter(i -> {return (i == n);}).count();
            }
            return answer;
        }
    }
}
