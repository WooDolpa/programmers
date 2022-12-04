package lv0.day15;

/**
 * packageName : lv0.day15
 * className : FindNumberTest
 * user : jwlee
 * date : 2022/12/03
 */
public class FindNumberTest {
    public static void main(String[] args) {

    }

    /**
     * 숫자 찾기
     *
     */
    public static class Solution {
        public int solution(int num, int k) {

            boolean isLen = 0 < num && num < 1000000;
            boolean isValid = 0 <= k && k < 10;
            int answer = 0;

            if(isValid && isLen) {
                String numStr = String.valueOf(num);
                answer = numStr.indexOf(String.valueOf(k));
                if(answer >= 0) {
                    answer += 1;
                }
            }

            return answer;
        }
    }
}
