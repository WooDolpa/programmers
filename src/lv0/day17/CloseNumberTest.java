package lv0.day17;

/**
 * packageName : lv0.day17
 * className : CloseNumberTest
 * user : jwlee
 * date : 2022/12/07
 */
public class CloseNumberTest {
    public static void main(String[] args) {
    }

    /**
     * 가까운 수
     *
     */
    public static class Solution {
        public int solution(int[] array, int n) {
            int answer = array[0];
            int absValue = Math.abs(n-array[0]);
            for (int i=1; i< array.length; i++) {
                int absIdxValue = Math.abs(n - array[i]);
                if(absIdxValue < absValue) {
                    absValue = absIdxValue;
                    answer = array[i];
                }
            }
            return answer;
        }
    }
}
