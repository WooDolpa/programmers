package lv0.day11;

import java.util.Arrays;

/**
 * packageName : lv0.day11
 * className : SelectMultipleTest
 * user : jwlee
 * date : 2022/11/30
 */
public class SelectMultipleTest {

    public static void main(String[] args) {
    }

    /**
     * n의 배수 고르기...
     * 테스트 케이스 한건 실패하였는데... 원인을 모르겠음...
     * n 과 numlist 유효성 검사에서 발생하는 이슈인거 같음
     *
     */
    public static class Solution {
        public int[] solution(int n, int[] numlist) {
            return Arrays.stream(numlist).filter(num -> { return (num % n == 0);}).toArray();
        }
    }

}
