package lv0.day10;

/**
 * packageName : lv0.day10
 * className : NumberPairTest
 * user : jwlee
 * date : 2022/11/28
 */
public class NumberPairTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(20));
        System.out.println(solution.solution(100));
    }

    /**
     * 순서쌍의 개수
     *
     */
    public static class Solution {
        public int solution(int n) {
            boolean isValidLen = (1 <= n && n <= 1000000);
            int answer = 0;
            if(isValidLen) {
                for (int i = 1; i <= n; i++) {
                    if(n % i == 0) answer++;
                }
            }
            return answer;
        }
    }
}
