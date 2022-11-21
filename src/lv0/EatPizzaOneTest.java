package lv0;

/**
 * packageName : lv0
 * className : EatPizzaOneTest
 * user : jwlee
 * date : 2022/11/21
 */
public class EatPizzaOneTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(15));
    }

    /**
     * 피자 나눠 먹기 (1)
     * 피자가게에서 피자 한개를 7조각으로 잘라서 준다 <br>
     * 이때 n명이 피자 한 조각 이상을 먹을 수 있는 피자의 수를 구하라 <br>
     * 제한사항 1 <= n <= 100
     *
     */
    public static class Solution{
        public int solution(int n) {
            boolean isValid = (1 <= n && n <= 100);
            int answer = 0;
            if(isValid){
                answer = (n/7);
                int remainder = n % 7;
                if (remainder > 0) answer++;
                return answer;
            }
            return answer;
        }
    }

    // 삼항 연산자로 표현했으면 더 깔끔할거 같다.
}
