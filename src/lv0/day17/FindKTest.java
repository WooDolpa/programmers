package lv0.day17;

/**
 * packageName : lv0.day17
 * className : FindKTest
 * user : jwlee
 * date : 2022/12/07
 */
public class FindKTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(1, 13, 1));
        System.out.println(solution.solution(10, 50, 5));
    }

    /**
     * k의 개수
     *
     */
    public static class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;
            for (int o = i; o <= j; o++) {
                if(o >= 10) {
                    answer += findNumberCount(o, k);
                }else{
                    if(o == k) answer++;
                }
            }
            return answer;
        }

        private int findNumberCount(int number, int k) {
            int result = 0;
            while (number > 0) {
                int a = number % 10;
                if(a == k) result++;
                number /= 10;
            }
            return result;
        }
    }
}
