package lv0.day17;

/**
 * packageName : lv0.day17
 * className : FactorialTest
 * user : jwlee
 * date : 2022/12/06
 */
public class FactorialTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    /**
     * 팩토리얼
     *
     */
    public static class Solution {
        public int solution(int n) {
            boolean isLen = (0 < n && n <= 3628800);
            int answer = 0;
            if(isLen) {
                answer = 1;
                while (true) {
                    int factorialNum = factorial(answer);
                    if(factorialNum > n) {
                        answer--;
                        break;
                    }else if(factorialNum == n) {
                        break;
                    }
                    answer++;
                }
            }
            return answer;
        }

        private int factorial(int n) {
            if(n <= 1) return 1;
            return n * factorial(n-1);
        }
    }
}
