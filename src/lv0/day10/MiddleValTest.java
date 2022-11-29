package lv0.day10;

import java.util.Arrays;

/**
 * packageName : lv0.day10
 * className : MiddleValTest
 * user : jwlee
 * date : 2022/11/27
 */
public class MiddleValTest {

    public static void main(String[] args) {
    }


    /**
     * 중앙값 구하기
     *
     */
    public static class Solution {
        public int solution(int[] array) {
            boolean isValid = validateArray(array);
            int answer = 0;
            if(isValid) {
                int idx = (array.length/2);
                int[] nArray = Arrays.stream(array).sorted().toArray();
                return nArray[idx];
            }
            return answer;
        }

        private boolean validateArray(int[] array) {

            boolean isValidLen = (array.length % 2 == 1);
            boolean isArray = (0 < array.length && array.length < 100);
            boolean isIndex = true;

            for (int n : array) {
                if(!(-1000 < n && n < 1000)){
                    isIndex = false;
                    break;
                }
            }

            return isValidLen && isArray && isIndex;
        }
    }
}
