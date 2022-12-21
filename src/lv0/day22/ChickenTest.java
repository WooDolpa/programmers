package lv0.day22;

/**
 * packageName : lv0.day22
 * className : ChickenTest
 * user : jwlee
 * date : 2022/12/21
 */
public class ChickenTest {


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(100));
        System.out.println(solution.solution(1081));
    }

    /**
     * 치킨 쿠폰
     *
     */
    public static class Solution {
        public int solution(int chicken) {
            int answer = -1;
            boolean isLen = 0 <= chicken && chicken <= 1000000;
            if(isLen) {
                answer = findChickenCount(chicken);
            }
            return answer;
        }

        private int findChickenCount(int chicken) {
            int count = (chicken/10);
            int remainder = (chicken % 10);
            if(count == 0) {
                return 0;
            }
            return count + findChickenCount(count+remainder);
        }
    }
}
