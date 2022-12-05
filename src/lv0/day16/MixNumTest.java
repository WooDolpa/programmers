package lv0.day16;

/**
 * packageName : lv0.day16
 * className : MixNumTest
 * user : jwlee
 * date : 2022/12/04
 */
public class MixNumTest {

    public static void main(String[] args) {

    }

    /**
     * 합성수 찾기
     *
     */
    public static class Solution {
        public int solution(int n) {
            boolean isValid = (1 <= n && n <= 100);
            int answer = 0;
            if(isValid) {
                for (int i=4; i <=n; i++) {
                    if(isMixNumber(i)) answer++;
                }
            }
            return answer;
        }

        private boolean isMixNumber(int number) {

            int count = 0;
            for (int i=1; i<=number; i++) {
                if(number % i == 0) {
                    count++;
                }

                if(count > 2) {
                    break;
                }
            }

            return count > 2 ? true : false;
        }
    }
}
