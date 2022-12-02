package lv0.day13;

/**
 * packageName : lv0.day13
 * className : BiggerNumTest
 * user : jwlee
 * date : 2022/11/30
 */
public class BiggerNumTest {
    public static void main(String[] args) {
    }

    /**
     * 가장 큰 수 찾기
     *
     */
    public static class Solution {
        public int[] solution(int[] array) {
            boolean isValidLen = (1 <= array.length && array.length <= 100);
            int[] answer = {};
            if(isValidLen) {
                int a = 0, idx = 0;
                for (int i=0; i < array.length; i++) {
                    if(array[i] > a) {
                        a = array[i];
                        idx = i;
                    }
                }

                answer = new int[2];
                answer[0] = a;
                answer[1] = idx;
            }
            return answer;
        }
    }
}
