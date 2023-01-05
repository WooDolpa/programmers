package lv0.day25;

/**
 * packageName : lv0.day25
 * className : ContinuitySumTest
 * user : jwlee
 * date : 2023/01/02
 */
public class ContinuitySumTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5,5));
    }

    /**
     * 연속된 수의 합
     *
     */
    public static class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];
            int sum = num * (1 + num) / 2;
            int start = (total-sum) / num;
            for (int i=1; i <= num; i++) {
                answer[i-1] = i + start;
            }
            return answer;
        }
    }
}
