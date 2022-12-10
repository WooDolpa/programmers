package lv0.day18;

/**
 * packageName : lv0.day18
 * className : SevenCountTest
 * user : jwlee
 * date : 2022/12/09
 */
public class SevenCountTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{7,77,17}));
    }

    /**
     * 7의 개수
     *
     */
    public static class Solution {
        public int solution(int[] array) {
            int answer = 0;
            int target = 7;
            for (int n : array) {
                answer += findTargetCount(n, target);
            }
            return answer;
        }

        private int findTargetCount(int number, int target){

            int count = 0;
            int n = number;
            while (true) {
                if(n%10 == target) count++;
                if(n/10 == 0) break;
                n = n/10;
            }

            return count;
        }
    }
}
