package lv0.day05;

import java.util.Arrays;

/**
 * packageName : lv0
 * className : TallTest
 * user : jwlee
 * date : 2022/11/20
 */
public class TallTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(solution.solution(new int[]{180, 120, 140}, 190));
    }

    /**
     * 키 큰 사람 구하기
     *
     */
    public static class Solution {
        public int solution(int[] array, int height) {

            boolean isValid = (1 <= array.length && array.length <= 100) && (1 <= height && height <= 200);
            int answer = 0;
            if(isValid) {
                for (int i=0; i<array.length; i++) {
                    int arrayHeight = array[i];
                    if(1 <= arrayHeight && arrayHeight <= 200) {
                        if(arrayHeight > height) {
                            answer++;
                        }
                    }
                }
            }
            return answer;
        }
    }
    // return (int) Arrays.stream(array).filter(value -> value > height).count();
}
