package lv0.day02;

/**
 * packageName : lv0
 * className : EatPizzaThreeTest
 * user : jwlee
 * date : 2022/11/21
 */
public class EatPizzaThreeTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(7, 10));
        System.out.println(solution.solution(4, 12));

    }

    public static class Solution {
        /**
         * 피자 두 조각에서 열 조각까지 원하는 조각 수로 자른다.
         * @param slice 피자 조각 수
         * @param n 피자 먹는 사람 수
         * @return 피자 몇판을 시켜야 하는가..?!
         * <br>
         * ex) slice : 7, n : 10 ==> answer = 2
         */
        public int solution(int slice, int n) {
            boolean isValid = (2 <= slice && slice <= 10) && (1 <= n && n <= 100);
            int answer = 0;
            if(isValid){
                return answer = ((n/slice)+(n%slice > 0 ? 1 : 0));
            }
            return answer;
        }
    }
}
