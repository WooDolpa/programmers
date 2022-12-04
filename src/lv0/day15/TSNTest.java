package lv0.day15;

/**
 * packageName : lv0.day15
 * className : TSNTest
 * user : jwlee
 * date : 2022/12/04
 */
public class TSNTest {

    public static void main(String[] args) {
    }

    /**
     * 369 게임
     *
     */
    public static class Solution {
        public int solution(int order) {
            boolean isValid = 1 <= order && order <= 1000000;
            int answer = 0;
            if (isValid) {
                String orderStr = String.valueOf(order);
                orderStr = orderStr.replaceAll("[^369]", "");
                return orderStr.trim().length();
            }
            return answer;
        }
    }
}
